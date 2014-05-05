
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldittm0798
 */
public abstract class Armor extends Unit {
    
    
    public void disable()
	{
        
    }
    
    public void attack(Location loc, String module){
        //Make attackLocations a private list
		//Check if loc is in the list
		//If not, relinquish the opportunity to attack (pass)
		
		
    }
	
	public abstract int getAttack();
	
	public abstract int getRange();
	
	public abstract int getDefense();
	
	public ArrayList<Location> availableAttacks(Game game)
	{
		
		ArrayList<Location> attackLocations = new ArrayList<Location>();
		//Iterate through location rings within range	
		return null;
	}
	
}
