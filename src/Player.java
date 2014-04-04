/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zchen0704
 */
public interface Player
{
	public void buyUnit(Unit u);
	
	public void moveUnit(Unit u, Location loc);
	
	public void attack(Unit u, Location loc);
	
	public void win();
	
	public void lose();
}
