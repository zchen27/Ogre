
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zchen0704
 */
public interface Grid<E>
{
	public E get(Location loc);
	
	public E put(Location loc, Object E);
	
	public ArrayList<Location> getEmptyAdjacentLocations(Location loc);
	
	public ArrayList<Location> getOccupiedAdjacentLocations(Location loc);
	
	public ArrayList<Location> getValidAdjacentLocations(Location loc);
	
	public ArrayList<E> getNeighbors();
	
	public int getNumCols();
	
	public int getNumRows();
	
}
