
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zchen0704
 * @param <E>
 */
public interface Grid<E>
{
	public E get(Location loc);
	
	public E put(Location loc, Object E);
	
	public E remove(Location loc);
	
	public ArrayList<Location> getOccupiedLocations();
	
	public ArrayList<Location> getEmptyAdjacentLocations(Location loc);
	
	public ArrayList<Location> getOccupiedAdjacentLocations(Location loc);
	
	public ArrayList<Location> getValidAdjacentLocations(Location loc);
	
	public ArrayList<E> getNeighbors(Location loc);
	
	public int getNumCols();
	
	public int getNumRows();
	
	public boolean isValid(Location loc);
	
}
