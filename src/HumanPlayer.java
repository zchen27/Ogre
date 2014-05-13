
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zchen0704
 */
public class HumanPlayer implements Player
{
	private int points;
	private ArrayList<Unit> reserves;
	
	@Override
	public void moveUnit(Unit u, Location loc)
	{
		u.move(loc);
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void attack(Unit u, Location loc, String module)
	{
		if((u instanceof Armor))
		{
			((Armor) u).attack(loc, module);
		}
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void win()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public void lose()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
}
