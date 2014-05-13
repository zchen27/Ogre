/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldittm0798
 */
public class HeavyTank extends Armor
{
	@Override
	public int getAttack()
	{
		return 4;
	}

	@Override
	public int getRange()
	{
		return 2;
	}

	@Override
	public int getDefense()
	{
		return 3;
	}

	@Override
	public int getMovement()
	{
		return 3;
	}

	@Override
	public void setMovement(int m)
	{
		
	}

	@Override
	public String getName()
	{
		return "Heavy Tank";
	}
}
