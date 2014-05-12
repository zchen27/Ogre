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
 * 
 */
public class DefaultGrid
{

	private static Unit[][] occupants;
	
	public DefaultGrid()
	{
		occupants = new Unit[21][15];
	}
	
	
	public Unit get(Location loc)
	{
		if(!isValid(loc))
		{
			throw new IllegalArgumentException("Location " + loc.toString() + " not Valid!");
		}
		return occupants[loc.getCol()][loc.getRow()];
	}

	
	public Unit put(Location loc, Unit U)
	{
		if(!isValid(loc))
		{
			throw new IllegalArgumentException("Location " + loc.toString() + " not Valid!");
		}
		
		int r = loc.getRow();
		int c = loc.getCol();
		U.placeSelfOnGrid(new Location(c, r), this);
		occupants[c][r] = U;
		return U;
	}
	
	
	public Unit remove(Location loc)
	{
		if(!isValid(loc))
		{
			throw new IllegalArgumentException("Location " + loc.toString() + " not Valid!");
		}
		
		int c = loc.getRow();
		int r = loc.getCol();
		Unit temp = occupants[c][r];
		occupants[c][r] = null;
		return temp;
	}

	
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
			
			if(occupants[c][r] == null)
			{
				neighbors.remove(l);
			}
		}
		
		return neighbors;
	}

	
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

	
	public ArrayList getNeighbors(Location loc)
	{
		return loc.getNeighbors();
	}

	
	public int getNumCols()
	{
		return occupants.length;
	}

	
	public int getNumRows()
	{
		return occupants[0].length;
	}

	
	public boolean isValid(Location loc)
	{
		boolean c = loc.getCol() >= 0 && loc.getCol() < getNumCols();
		boolean r = loc.getRow() >= 0 && loc.getRow() < getNumRows();
		return c && r;
	}
	
}
