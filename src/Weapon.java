/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zchen0704
 */
public abstract class Weapon
{	
	protected int attack;
	protected int defense;
	protected int range;
	private Status status = Status.ALIVE;
	private boolean reloading = false;
	
	public void die()
	{
		status = Status.DEAD;
	}
	
	public void fire()
	{
		reloading = true;
	}
	
	public void refresh()
	{
		reloading = false;
	}
	
	public int getAttack()
	{
		return attack;
	}
		
	public int getDefense()
	{
		return defense;
	}
	
	public int getRange()
	{
		return range;
	}
}
