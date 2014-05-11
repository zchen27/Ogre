
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

	public abstract int getTracks();

	public abstract int getMainBattery();
	
	public abstract int getSecondaryBattery();
	
	public abstract int getMissileTube();
	
	public abstract int getInternalMissiles();
	
	public abstract int setTracks(int n);
	
	public abstract int setMainBattery(int n);
	
	public abstract int setSecondaryBattery(int n);
	
	public abstract int setMissileTube(int n);
	
	public abstract int setInternalMissiles(int n);
	
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
		
	}

	public void killSecondaryBattery()
	{
		
	}

	public void killTracks(int num)
	{
		
	}

	public void killMissileTube()
	{
		
	}

	public void killExternalMissile()
	{
		
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
