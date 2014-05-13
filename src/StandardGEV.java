/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldittm0798
 */
public class StandardGEV extends GEV{

	@Override
	public int getAttack()
	{
		return 2;
	}

	@Override
	public int getRange()
	{
		return 2;
	}

	@Override
	public int getDefense()
	{
		return 2;
	}

	@Override
	public String getName()
	{
		return "GEV";
	}

	@Override
	public int getMovement()
	{
		return 3;
	}
    
}
