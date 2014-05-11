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
	private static final int ATTACK = 4;
	private static final int DEFENSE = 3; 
	private static final int RANGE = 2;
	private static final int MOVEMENT = 3;
	
	public HeavyTank()
	{
		
	}

	@Override
	public int getAttack()
	{
		return ATTACK;
	}

	@Override
	public int getRange()
	{
		return RANGE;
	}

	@Override
	public int getDefense()
	{
		return DEFENSE;
	}

	@Override
	public int getMovement()
	{
		return MOVEMENT;
	}

	@Override
	public String getName()
	{
		return "Heavy Tank";
	}
}
