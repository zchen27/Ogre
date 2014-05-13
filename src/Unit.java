
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;


/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldittm0798
 */
public abstract class Unit {
    
    private int cost;
    private int movement;
	private int remainingMoves;
	private boolean alive = true;
	private ArrayList<Location> validMove = new ArrayList();
    private Location loc;
    private Grid grid;
    
    private int attackDamage;
    private int defenseStrength;
    
	private ArrayList<Location> fringes = new ArrayList<Location>();
	private HashSet<Location> moves = new HashSet<Location>();
    
    public Location getLocation(){
        return loc;
    }
    
    public void die(){
        alive = false;
    }
    
    public void placeSelfOnGrid(Location newLoc, Grid grid){
        loc = newLoc;
        this.grid = grid;
    }
    
   public void move(Location loc){
       
   }
   
   public abstract String getName();
   
    
    public boolean checkLocation(Location loc, Grid grid){
        try{
    	if(loc.isCrater() || grid.get(loc) != null){
            return false;
        }
        }
        catch (IllegalArgumentException ex)
        {
        	return false;
        }
        return true;
        //returns true if location is empty
    }
    
	private void floodFill(Location loc)
	{
		
		System.out.println("ran");
		for(int i = 0; i < validMove.size(); i++)
		{
			System.out.print(validMove.get(i) + " ");
		}
		System.out.println();
		
		if(validMove.contains(loc) || loc.isCrater() || remainingMoves <= 0)
		{
			System.out.println(validMove.contains(loc) + " " +  loc.isCrater() + " " + remainingMoves);
			return;
		}
		else
		{
			validMove.add(loc);
			remainingMoves--;
			floodFill(loc.getAdjacentLocation(Location.Direction.N));
			floodFill(loc.getAdjacentLocation(Location.Direction.NW));
			floodFill(loc.getAdjacentLocation(Location.Direction.SW));
			floodFill(loc.getAdjacentLocation(Location.Direction.S));
			floodFill(loc.getAdjacentLocation(Location.Direction.SE));
			floodFill(loc.getAdjacentLocation(Location.Direction.NE));
		}
	}
	
    public ArrayList<Location> availableMoves(Grid grid){
		
		/*//Necessary?
		fringes = new ArrayList<Location>();
		//
		
        fringes.add(loc);
		//remainingMoves=movement + 1;
		remainingMoves=1;
		System.out.println(loc.toString());
		//
		
        surroundingSpots(loc, grid);
		
        Set<Location> fringeSet = new HashSet<Location>(fringes);
        fringes = new ArrayList<Location>(fringeSet);
		return fringes;*/
		validMove = new ArrayList();
		remainingMoves = movement;
		floodFill(getLocation());
		return validMove;
    }
	
	private void surroundingSpots(Location loc, Grid grid){
		ArrayList<Location> surroundingSet = loc.getNeighbors();
		for(int j=0; j<surroundingSet.size(); j++){
			boolean check = checkLocation(surroundingSet.get(j), grid);
			System.out.println(surroundingSet.get(j) + " " + check);
			if(!check){
				surroundingSet.remove(j);
				j--;
			} else {
				for(int f=0; f<fringes.size(); f++){
					System.out.println(j + " Line 93");
					if(surroundingSet.get(j).equals(fringes.get(f))){
						surroundingSet.remove(j);
						j--;
					}
				}
			}
		}
		
		//
		for(int m=0; m<surroundingSet.size(); m++){
			System.out.println(surroundingSet.get(m));
		}
		//
				
		fringes.addAll(surroundingSet);
		//remainingMoves--;
		
		//
		for(int n=0; n<surroundingSet.size(); n++){
			System.out.println(fringes.get(n));
		}
		//
		
		for(int l=0; l<surroundingSet.size() && remainingMoves>1; l++){
			surroundingSpots(surroundingSet.get(l), grid);
			remainingMoves--;
		}
		
		//^^ add while for remaining moves >> doesnt work
		
		//remaingMoves is decreased at EVERY iteration, not just when the distance increases?? --> Fixed?
		
		//This is a comment for a test commit
		
	}
	
	public int getCost()
	{
		return cost;
	}
	
	public abstract int getMovement();
	
	public void setMovement(int m)
	{
		movement = m;
	}
	
	public boolean isAlive()
	{
		return alive;
	}
    
}
