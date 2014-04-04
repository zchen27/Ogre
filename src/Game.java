
import java.util.ArrayList;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldittm0798
 */
public class Game(humanPlayer human, computerPlayer computer) {
    
    int difficulty;
    protected ArrayList<Unit> units;
    
    public boolean scanLocations(Location loc){
        for(int i=0; i<units.size(); i++){
            Location here = units.get(i).getLocation();
            if(here.equals(loc)){
                return true;
            }
        }
        return false;
    }
    
    public void start(){
        
    }
    
    public void drawBoard(){
    
    }
    
    public void changeSides(){
        
    }
    
    public Result roll(int attack, int defense){
        
    }
    
    public void addUnit(Unit unit, Player player){
        
    }
    
}
