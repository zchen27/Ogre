

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
	
	public enum Direction
	{
		N, S, NW, SW, NE, SE
	}
	
	
	
	@Override
	public int compareTo(Object o)
	{
		Location other = (Location) o;
		int c = other.getRow();
		int r = other.getCol();
		
		return 0;
	}
	
	public boolean equals(Object o)
	{
		Location other = (Location) o;
		
		if(other.getCol() == col && other.getRow() == row)
		{
			return true;
		}
		
		return false;
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
				
		}
	}
	
}
