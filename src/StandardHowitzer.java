/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldittm0798
 */
public class StandardHowitzer extends Armor{

	@Override
	public int getAttack()
	{
		return 6;
	}

	@Override
	public int getRange()
	{
		return 8;
	}

	@Override
	public int getDefense()
	{
		return 1;
	}

	@Override
	public String getName()
	{
		return "Howitzer";
	}

	@Override
	public int getMovement()
	{
		return 0;
	}
    
}
