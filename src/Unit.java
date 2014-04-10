
import java.util.ArrayList;
import java.util.HashSet;
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
    Location loc;
    Status status;
	private ArrayList<Location> fringes = new ArrayList<Location>();
    
    public Location getLocation(){
        return loc;
    }
    
    public void die(){
        status = Status.DEAD;
    }
    
    public void placeSelfOnGrid(Location loc){
        //
    }
    
   public void move(Location loc){
        //
    }
    
    public boolean checkLocation(Location loc, Game game){
        if(loc.isCrater() || game.scanLocations(loc)){
            return false;
        }
        return true;
        //returns true if location is empty
    }
    
    public ArrayList<Location> availableMoves(Game game){
		
        fringes.add(loc);
		remainingMoves=movement;
		
        surroundingSpots(loc, game);
		
        Set<Location> fringeSet = new HashSet<Location>(fringes);
        fringes = new ArrayList<Location>(fringeSet);
		return fringes;
    }
	
	private void surroundingSpots(Location loc, Game game){
		ArrayList<Location> surroundingSet = loc.getNeighbors();
		for(int j=0; j<surroundingSet.size(); j++){
			boolean check = checkLocation(surroundingSet.get(j), game);
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
		remainingMoves--;
		for(int l=0; l<surroundingSet.size() && remainingMoves>0; l++){
			surroundingSpots(surroundingSet.get(l), game);
		}
		
		//will loop forever: a neighbor of a location will have the location as its neighbor
		
	}
    
}
