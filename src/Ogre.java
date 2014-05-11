
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

	String className;
	String unitName;
	private int movement;

	public abstract int getTracks();

	public abstract int getMainBattery();
	
	public abstract int getSecondaryBattery();
	
	public abstract int getMissileTube();
	
	public abstract int getInternalMissiles();
	
	public abstract int getExternalMissiles();
	
	public abstract int setTracks(int n);
	
	public abstract int setMainBattery(int n);
	
	public abstract int setSecondaryBattery(int n);
	
	public abstract int setMissileTube(int n);
	
	public abstract int setInternalMissiles(int n);
	
	public abstract int setExternalMissiles(int n);
	
	public void mainBatteryAttack(Location loc)
	{
		//
	}

	public void secondaryBatteryAttack(Location loc)
	{
		//
	}

	public void externaMissileAttack(Location loc)
	{
		//
	}

	public void internalMissileAttack(Location loc)
	{
		//
	}
	
	public void overrun(Location loc)
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

	public void killMissileTube()
	{
		setMissileTube(getMissileTube() - 1);
		setInternalMissiles(getInternalMissiles() - 1);
	}

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
