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
}
