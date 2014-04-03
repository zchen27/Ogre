
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
    protected ArrayList<MissileTube> rack;
    protected ArrayList<ExternalMissile> external;
    protected ArrayList<Antipersonnel> ap;
    
    int internalMissile;
    String className;
    String unitName;
    
    public int getTracks(){
        
    }
    
    public int getMainBattery(){
        
    }
    
    public int getSecondaryBattery(){
        
    }
    
    public int getMissileTube(){
        
    }
    
    public int getRemainingInternalMissiles(){
        
    }
    
    public void mainBatteryAttack(Location loc){
        
    }
    
    public void secondaryBatteryAttack(Location loc){
        
    }
    
    public void externaMissileAttack(Location loc){
        
    }
    
    public void internalMissileAttack(Location loc){
        
    }
    
    public void apAttack(Location loc){
        
    }
    
    public void overrun(Location loc){
        
    }
    
    public void hitMainBattery(){
        
    }
    
    public void hitSecondaryBattery(){
        
    }
    
    public void hitTracks(){
        
    }
    
    @Override public void move(Location loc){
        
    }
    
    @Override public void die(){
        
    }
    
    public void lastResult(){
        
    }
    
}
