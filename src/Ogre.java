
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
    
    protected ArrayList<MainBattery> main;
    protected ArrayList<SecondaryBattery> secondary;
    protected ArrayList<MissileTube> tube;
    protected ArrayList<ExternalMissile> external;
    protected ArrayList<Antipersonnel> ap;
    
    int internalMissiles;
    int tracks;
    String className;
    String unitName;
    
    public int getTracks(){
        return tracks;
    }
    
    public int getMainBattery(){
        return main.size();
    }
    
    public int getSecondaryBattery(){
        return secondary.size();
    }
    
    public int getMissileTube(){
        return tube.size();
    }
    
    public int getRemainingInternalMissiles(){
        return internalMissiles;
    }
    
    public void mainBatteryAttack(Location loc){
        //
    }
    
    public void secondaryBatteryAttack(Location loc){
        //
    }
    
    public void externaMissileAttack(Location loc){
        //
    }
    
    public void internalMissileAttack(Location loc){
        //
    }
    
    public void apAttack(Location loc){
        //
    }
    
    public void overrun(Location loc){
        //
    }
    
    public void killMainBattery(){
        main.remove(0);
    }
    
    public void killSecondaryBattery(){
        secondary.remove(0);
    }
    
    public void killTracks(int num){
        tracks = tracks-num;
    }
    
    public void killMissileTube(){
        tube.remove(0);
    }
    
    public void killExternalMissile(){
        external.remove(0);
    }
    
    public void killAntipersonnel(){
        ap.remove(0);
    }
    
    @Override public void move(Location loc){
        //
    }
    
    @Override public void die(){
        if((main.size()==0)&&(secondary.size()==0)&&(tube.size()==0)&&(external.size()==0)&&(ap.size()==0)&&(tracks==0)){
            status = Status.DEAD;
        }
    }
    
    public void lastResult(){
        //
    }
    
}
