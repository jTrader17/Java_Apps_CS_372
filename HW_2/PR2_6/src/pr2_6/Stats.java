/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr2_6;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Jason Trader
 */
public class Stats {
    
    public static int getMin(ArrayList<Integer> myList){
       Collections.sort(myList);
       return myList.get(0).intValue();
    }
    
    public static int getMax(ArrayList<Integer> myList){
        Collections.sort(myList);
        return myList.get(myList.size()-1);
    }
    
    public static double getAvg(ArrayList<Integer> myList){
        double sum = 0.0;
        for (Integer i : myList){
            sum += i.intValue();
        }
        return (1.0*sum/myList.size());
    }
}


