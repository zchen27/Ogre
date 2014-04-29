
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
    
    int cost;
    int movement;
	int remainingMoves;
    private Location loc;
    private Grid grid;
    Status status;
	private ArrayList<Location> fringes = new ArrayList<Location>();
	private HashSet<Location> moves = new HashSet<Location>();
    
    public Location getLocation(){
        return loc;
    }
    
    public void die(){
        status = Status.DEAD;
    }
    
    public void placeSelfOnGrid(Location newLoc, Grid grid){
        loc = newLoc;
        this.grid = grid;
    }
    
   public void move(Location loc){
       
   }
   
    
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
    
    public ArrayList<Location> availableMoves(Grid grid){
		
		//Necessary?
		fringes = new ArrayList<Location>();
		//
		
        fringes.add(loc);
		remainingMoves=movement + 1;
		
        surroundingSpots(loc, grid);
		
        Set<Location> fringeSet = new HashSet<Location>(fringes);
        fringes = new ArrayList<Location>(fringeSet);
		return fringes;
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
					if(surroundingSet.get(j).equals(fringes.get(f))){
						surroundingSet.remove(j);
						j--;
					}
				}
			}
		}
		fringes.addAll(surroundingSet);
		//remainingMoves--;
		for(int l=0; l<surroundingSet.size() && remainingMoves>1; l++){
			surroundingSpots(surroundingSet.get(l), grid);
			remainingMoves--;
		}
		
		//remaingMoves is decreased at EVERY iteration, not just when the distance increases?? --> Fixed?
		
	}
    
}
