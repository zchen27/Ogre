import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zchen0704
 * @param <Unit>
 */
public class DefaultGrid<Unit> implements Grid
{

	private Object[][] occupants;
	
	public DefaultGrid(int r, int c)
	{
		if(r > 0 && c > 0)
		{
			occupants = new Object[r][c];
		}
		else
		{
			throw new IllegalArgumentException(r + " by " + c + " is not a valid size");
		}
	}
	
	@Override
	public Object get(Location loc)
	{
		if(!isValid(loc))
		{
			throw new IllegalArgumentException("Location " + loc.toString() + " not Valid!");
		}
		
		return (Unit) occupants[loc.getRow()][loc.getCol()];
	}

	@Override
	public Object put(Location loc, Object E)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}
	
	@Override
	public Object remove(Location loc)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ArrayList getEmptyAdjacentLocations(Location loc)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public ArrayList getOccupiedLocations()
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
	public ArrayList getNeighbors(Location loc)
	{
		throw new UnsupportedOperationException("Not supported yet.");
	}

	@Override
	public int getNumCols()
	{
		return occupants.length;
	}

	@Override
	public int getNumRows()
	{
		return occupants[0].length;
	}

	@Override
	public boolean isValid(Location loc)
	{
		boolean c = loc.getCol() > 0 && loc.getCol() < getNumCols();
		boolean r = loc.getRow() > 0 && loc.getRow() < getNumRows();
		
		return c && r;
	}
	
}
