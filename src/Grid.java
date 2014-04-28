
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zchen0704
 * @param <Unitt>
 */
public interface Grid
{
	public Unit get(Location loc);
	
	public Unit put(Location loc, Unit Unitt);
	
	public Unit remove(Location loc);
	
	public ArrayList<Location> getOccupiedLocations(Location loc);
	
	public ArrayList<Location> getEmptyAdjacentLocations(Location loc);
	
	public ArrayList<Location> getOccupiedAdjacentLocations(Location loc);
	
	public ArrayList<Location> getValidAdjacentLocations(Location loc);
	
	public ArrayList<Unit> getNeighbors(Location loc);
	
	public int getNumCols();
	
	public int getNumRows();
	
	public boolean isValid(Location loc);
	
}
