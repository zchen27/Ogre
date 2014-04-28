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
public class DefaultGrid implements Grid
{

	private Unit[][] occupants;
	
	public DefaultGrid(int r, int c)
	{
		if(r > 0 && c > 0)
		{
			occupants = new Unit[r][c];
		}
		else
		{
			throw new IllegalArgumentException(r + " by " + c + " is not a valid size");
		}
	}
	
	public DefaultGrid()
	{
		occupants = new Unit[15][21];
	}
	
	@Override
	public Unit get(Location loc)
	{
		if(!isValid(loc))
		{
			throw new IllegalArgumentException("Location " + loc.toString() + " not Valid!");
		}
		
		return occupants[loc.getRow()][loc.getCol()];
	}

	@Override
	public Unit put(Location loc, Unit U)
	{
		if(!isValid(loc))
		{
			throw new IllegalArgumentException("Location " + loc.toString() + " not Valid!");
		}
		
		int r = loc.getRow();
		int c = loc.getCol();
		occupants[r][c] = U;
		return U;
	}
	
	@Override
	public Unit remove(Location loc)
	{
		if(!isValid(loc))
		{
			throw new IllegalArgumentException("Location " + loc.toString() + " not Valid!");
		}
		
		int r = loc.getRow();
		int c = loc.getCol();
		Unit temp = occupants[r][c];
		occupants[r][c] = null;
		return temp;
	}

	@Override
	public ArrayList getEmptyAdjacentLocations(Location loc)
	{
		ArrayList<Location> neighbors = getNeighbors(loc);
		for(Location l: neighbors)
		{
			if(!isValid(l))
			{
				throw new IllegalArgumentException("Location " + loc.toString() + " not Valid!");
			}
			
			int r = l.getRow();
			int c = l.getCol();
			
			if(occupants[r][c] != null)
			{
				neighbors.remove(l);
			}
		}
		
		return neighbors;
	}

	@Override
	public ArrayList getOccupiedLocations(Location loc)
	{
		ArrayList<Location> locations = new ArrayList();
		for(int i = 0; i < occupants.length; i++)
		{
			for(int j = 0; j < occupants[0].length; j++)
			{
				if(occupants[i][j] != null)
				{
					locations.add(new Location(i, j));
				}
			}
		}
		
		return locations;
	}

	@Override
	public ArrayList getOccupiedAdjacentLocations(Location loc)
	{
		ArrayList<Location> neighbors = getNeighbors(loc);
		for(Location l: neighbors)
		{
			if(!isValid(l))
			{
				throw new IllegalArgumentException("Location " + loc.toString() + " not Valid!");
			}
			
			int r = l.getRow();
			int c = l.getCol();
			
			if(occupants[r][c] == null)
			{
				neighbors.remove(l);
			}
		}
		
		return neighbors;
	}

	@Override
	public ArrayList getValidAdjacentLocations(Location loc)
	{
		ArrayList<Location> neighbors = getEmptyAdjacentLocations(loc);
		for(Location l: neighbors)
		{
			if(l.isCrater())
			{
				neighbors.remove(l);
			}
		}
		
		return neighbors;
	}

	@Override
	public ArrayList getNeighbors(Location loc)
	{
		return loc.getNeighbors();
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
