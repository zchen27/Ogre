/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zchen0704
 */
public class ExternalMissile extends Weapon
{
	public ExternalMissile()
	{
		super.attack = 6;
		super.range = 5;
		super.defense = 3;
	}
	
	@Override
	public void fire()
	{
		this.die();
	}
}
