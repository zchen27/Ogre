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
    
    public void die(){
        status = Status.DEAD;
    }
    
    void placeSelfOnGrid(Location loc){
        //
    }
    
    void move(Location loc){
        //
    }
    
    boolean checkLocation(Location loc){
        //
    }
    
}
