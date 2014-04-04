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
    
    public boolean checkLocation(Location loc){
        if(loc.isCrater() || loc.){
            return false;
        }
        return true;
    }
    
}
