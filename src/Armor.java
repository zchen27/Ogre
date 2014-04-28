
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
    
    protected int attack;
    protected int range;
    protected int defense;
	protected int move;
    
    public void disable(){
        
    }
    
    public void attack(Location loc){
        //Make attackLocations a private list
		//Check if loc is in the list
		//If not, relinquish the opportunity to attack (pass)
    }
	
	public int getAttack()
	{
		return attack;
	}
	
	public int getRange()
	{
		return range;
	}
	
	public int getDefense()
	{
		return defense;
	}
	
	public int getMove()
	{
		return move;
	}
	
	public ArrayList<Location> availableAttacks(Game game){
		
		ArrayList<Location> attackLocations = new ArrayList<Location>();
		//Iterate through location rings within range
		
	}
	
}
