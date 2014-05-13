
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldittm0798
 */
public abstract class Ogre extends Unit {

	private String className;
	private String unitName;

	public abstract int getTracks();

	public abstract int getMainBattery();
	
	public abstract int getSecondaryBattery();
	
	//public abstract int getMissileTube();
	
	//public abstract int getInternalMissiles();
	
	public abstract int getExternalMissiles();
	
	public abstract String getClassName();
	
	//public abstract String getUnitName();
	
	public abstract void setTracks(int n);
	
	public abstract void setMainBattery(int n);
	
	public abstract void setSecondaryBattery(int n);
	
	//public abstract int setMissileTube(int n);
	
	//public abstract int setInternalMissiles(int n);
	
	public abstract void setExternalMissiles(int n);
	
	public void mainBatteryAttack(Grid grid, Location loc)
	{
		//grid.get(loc)
	}

	public void secondaryBatteryAttack(Grid grid, Location loc)
	{
		//
	}

	public void externaMissileAttack(Grid grid, Location loc)
	{
		//
	}

	public void internalMissileAttack(Grid grid, Location loc)
	{
		//
	}
	
	public void overrun(Grid grid)
	{
		//
	}
	
	public void killMainBattery()
	{
		setMainBattery(getMainBattery() - 1);
	}

	public void killSecondaryBattery()
	{
		setSecondaryBattery(getSecondaryBattery() - 1);
	}

	public void killTracks(int n)
	{
		setTracks(getTracks() - n);
	}

	//public void killMissileTube()
	//{
	//	setMissileTube(getMissileTube() - 1);
	//	setInternalMissiles(getInternalMissiles() - 1);
	//}

	public void killExternalMissiles()
	{
		setExternalMissiles(getExternalMissiles() - 1);
	}


	@Override public void move(Location loc)
	{
		//
	}

	@Override public void die()
	{
		
	}

	public void lastResult(){
	//
	}

}
