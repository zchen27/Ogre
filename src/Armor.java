
import java.util.ArrayList;
import java.util.HashSet;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldittm0798
 */
public abstract class Armor extends Unit {
    
	private ArrayList<Location> attackLocations;
    private Status status;
	
    public void disable()
	{
        if(status != Status.DISABLED)
		{
			status = Status.DISABLED;	
		}
		else
		{
			die();
		}
	}
	
	@Override
	public void die()
	{
		super.die();
		status = Status.DEAD;
	}
    
    public void attack(Location loc, String module)
	{
        //Make attackLocations a private list
		//Check if loc is in the list
		//If not, relinquish the opportunity to attack (pass)
		//FRIENDLY FIRE IS ON! You may demolish your own disabled vehicles!
		
    }
	
	public abstract int getAttack();
	
	public abstract int getRange();
	
	public abstract int getDefense();
	
	public Status getStatus()
	{
		return status;
	}
	
	public ArrayList<Location> availableAttacks(Game game)
	{
		
		attackLocations = new ArrayList();
		HashSet<Location> valid  = new HashSet();
		valid.add(this.getLocation());
		//Iterate through location rings within range	
		for(int i = 0; i < getRange(); i++)
		{
			for(Location l: valid)
			{
				valid.addAll(l.getNeighbors());
			}
		}
		valid.remove(this.getLocation());
		return new ArrayList(valid);
	}
	
}
