
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
        int rollNumber = 1 + (int)(Math.random()*((6-1)+1));
		double combatRatio = (attack/defense);
		//double chartRatio;
		
		//Always in favor of defense
		
		if(combatRatio>5){
			return Result.X;
		} else if(combatRatio>4){
			if(rollNumber==1){
				return Result.D;
			} else if(rollNumber==2){
				return Result.X;
			} else if(rollNumber==3){
				return Result.X;
			} else if(rollNumber==4){
				return Result.X;
			} else if(rollNumber==5){
				return Result.X;
			} else {
				return Result.X;
			}
		} else if(combatRatio>3){
			if(rollNumber==1){
				return Result.D;
			} else if(rollNumber==2){
				return Result.D;
			} else if(rollNumber==3){
				return Result.X;
			} else if(rollNumber==4){
				return Result.X;
			} else if(rollNumber==5){
				return Result.X;
			} else {
				return Result.X;
			}
		} else if(combatRatio>2){
			if(rollNumber==1){
				return Result.NE;
			} else if(rollNumber==2){
				return Result.D;
			} else if(rollNumber==3){
				return Result.D;
			} else if(rollNumber==4){
				return Result.X;
			} else if(rollNumber==5){
				return Result.X;
			} else {
				return Result.X;
			}
		} else if(combatRatio>1){
			if(rollNumber==1){
				return Result.NE;
			} else if(rollNumber==2){
				return Result.NE;
			} else if(rollNumber==3){
				return Result.D;
			} else if(rollNumber==4){
				return Result.D;
			} else if(rollNumber==5){
				return Result.X;
			} else {
				return Result.X;
			}
		} else if(combatRatio>0.5){
			if(rollNumber==1){
				return Result.NE;
			} else if(rollNumber==2){
				return Result.NE;
			} else if(rollNumber==3){
				return Result.NE;
			} else if(rollNumber==4){
				return Result.NE;
			} else if(rollNumber==5){
				return Result.D;
			} else {
				return Result.X;
			}
		} else {
			return Result.NE;
		}
		
    }
    
    public void addUnit(Unit unit, Player player){
        
    }
    
}
