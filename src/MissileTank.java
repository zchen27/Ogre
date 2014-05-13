/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldittm0798
 */
public class MissileTank extends Armor{

	@Override
	public int getAttack()
	{
		return 3;
	}

	@Override
	public int getRange()
	{
		return 4;
	}

	@Override
	public int getDefense()
	{
		return 2;
	}

	@Override
	public String getName()
	{
		return "Missile Tank";
	}

	@Override
	public int getMovement()
	{
		return 2;
	}
    
}
