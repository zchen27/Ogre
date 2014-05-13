
public class MarkThree extends Ogre {

	private int tracks = 45;
	private int mainBattery = 1;
	private int secondaryBattery = 4;
	private int externalMissiles = 2;

	public String getName(){
		return getClassName();
	}

	public int getMovement(){
		return 3;
	}

	public int getTracks(){
		return tracks;
	}

	public int getMainBattery(){
		return mainBattery;
	}

	public int getSecondaryBattery(){
		return secondaryBattery;
	}

	public int getExternalMissiles(){
		return externalMissiles;
	}

	public String getClassName(){
		return "Mk.III";
	}

	public void setTracks(int n){
		tracks = n;
	}

	public void setMainBattery(int n){
		mainBattery = n;
	}

	public void setSecondaryBattery(int n){
		secondaryBattery = n;
	}

	public void setExternalMissiles(int n){
		externalMissiles = n;
	}

}
