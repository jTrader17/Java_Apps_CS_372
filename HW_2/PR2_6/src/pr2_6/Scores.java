/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_6;
import java.util.ArrayList;

/**
 *
 * @author Jason Trader
 */
public class Scores {
    private ArrayList<Integer> myScores = new ArrayList<Integer>();
    
    public Scores(){
    }
    
    public ArrayList<Integer> getScores(){
        return myScores;
    }
    
    public void addScore(int a){
        myScores.add(a);
    }
    
}
