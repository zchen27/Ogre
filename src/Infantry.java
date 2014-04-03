/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ldittm0798
 */
public class Infantry extends Unit{
    
    int strength;
    int attack;
    int range;
    int defense;
    
    void reduce(){
        
    }
    
    void split(int n){
        
    }
    
    @Override public void die(){
        if(strength==0){
            status = Status.DEAD;
        }
    }
    
}
