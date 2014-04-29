
import java.util.ArrayList;



/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zchen0704
 */
public class Location implements Comparable
{
	private int col;
	private int row;
	private boolean isCrater = false;
	
	public enum Direction
	{
		N, S, NW, SW, NE, SE
	}
	
	public Location(int c, int r)
	{
		col = c;
		row = r;
	}
	
	public Location(String s)
	{
		if(s.length() != 4 && !s.matches("[0-9]+"))
		{
			throw new IllegalArgumentException("INVALID STRING");
		}
		
		col = Integer.parseInt(s.substring(0, 2));
		row = Integer.parseInt(s.substring(2, 4));
	}
	
	@Override
	public int compareTo(Object o)
	{
		Location other = (Location) o;
		int c = other.getRow();
		int r = other.getCol();
		
		return 0;
	}
	
	@Override
	public boolean equals(Object o)
	{
		Location other = (Location) o;
		
		if(other.getCol() == col && other.getRow() == row)
		{
			return true;
		}
		
		return false;
	}
	
	@Override
	public String toString()
	{	
		return col + "-" + row;
	}
	
	public int getCol()
	{
		return col;
	}
	
	public int getRow()
	{
		return row;
	}
	
	public Location getAdjacentLocation(Direction dir)
	{
		switch(dir)
		{
			case N:
				return new Location(col, row - 1);
			case NE:
				return new Location(col + 1, row -1);
			case NW:
				return new Location(col - 1, row);
			case S:
				return new Location(col, row + 1);
			case SE:
				return new Location(col + 1, row);
			case SW:
				return new Location(col - 1, row);
			default:
				return null;
		}
	}
        
	public ArrayList<Location> getNeighbors()
	{
		ArrayList<Location> neighbors = new ArrayList<Location>();
		neighbors.add(getAdjacentLocation(Direction.N));
		neighbors.add(getAdjacentLocation(Direction.NE));
		neighbors.add(getAdjacentLocation(Direction.NW));
		neighbors.add(getAdjacentLocation(Direction.S));
		neighbors.add(getAdjacentLocation(Direction.SE));
		neighbors.add(getAdjacentLocation(Direction.SW));
		return neighbors;
	}
	
	public void setCrater(boolean b)
	{
		isCrater = b;
	}
	
	public boolean isCrater()
	{
		return isCrater;
	}
}
