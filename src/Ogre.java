
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
    protected ArrayList<MissileRacks> rack;
    protected ArrayList<ExternalMissile> external;
    protected ArrayList<AntiPersonnel> ap;
    
    int internalMissile;
    String className;
    String unitName;
    
    int getTracks(){
        
    }
    
    int getMainBattery(){
        
    }
    
    int getSecondaryBattery(){
        
    }
    
    int getMissileRacks(){
        
    }
    
    int getRemainingInternalMissiles(){
        
    }
    
    void mainBatteryAttack(Location loc){
        
    }
    
    void secondaryBatteryAttack(Location loc){
        
    }
    
    void externaMissileAttack(Location loc){
        
    }
    
    void internalMissileAttack(Location loc){
        
    }
    
    void apAttack(Location loc){
        
    }
    
    void overrun(Location loc){
        
    }
    
    void hitMainBattery(){
        
    }
    
    void hitSecondaryBattery(){
        
    }
    
    void hitTracks(){
        
    }
    
    @Override void move(){
        
    }
    
    @Override void die(){
        
    }
    
    void lastResult(){
        
    }
    
}
