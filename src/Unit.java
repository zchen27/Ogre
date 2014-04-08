
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
    Location loc;
    Status status;
    
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
        //Check locations extending out from "loc" a number of "movement" steps
        //Remove duplicates (java.util.set)
        //NEED getNeighbors METHOD!!!
        ArrayList<Location> fringes = new ArrayList<Location>();
        fringes.add(loc);
        //...http://www.redblobgames.com/grids/hexagons/
        for(int k=1; k<=movement; k++){
            ArrayList<Location> lastSet = new ArrayList<Location>();
            lastSet = loc.getNeighbors();
            for(int j=0; j<lastSet.size(); j++){
                boolean check1 = checkLocation(lastSet.get(j), game);
                if(!check1){
                    lastSet.remove(j);
                    j--;
                }
            }
        }
        Set<Location> fringeSet = new HashSet<Location>(fringes);
        fringes = new ArrayList<Location>(fringeSet);
    }
    
}
