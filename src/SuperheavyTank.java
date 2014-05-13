/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldittm0798
 */
public class SuperheavyTank extends Armor{

	@Override
	public int getAttack()
	{
		return 6;
	}

	@Override
	public int getRange()
	{
		return 3;
	}

	@Override
	public int getDefense()
	{
		return 4;
	}

	@Override
	public String getName()
	{
		return "Superheavy Tank";
	}

	@Override
	public int getMovement()
	{
		return 3;
	}
    
}
