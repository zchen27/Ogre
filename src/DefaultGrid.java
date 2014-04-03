
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zchen0704
 */
public class DefaultGrid<Unit> implements Grid
{
	public static final int ROWS = 21;
	public static final int COLS = 15;
	
	@Override
	public Object get(Location loc)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public Object put(Location loc, Object E)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ArrayList getEmptyAdjacentLocations(Location loc)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ArrayList getOccupiedAdjacentLocations(Location loc)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ArrayList getValidAdjacentLocations(Location loc)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ArrayList getNeighbors()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getNumCols()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getNumRows()
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
}
