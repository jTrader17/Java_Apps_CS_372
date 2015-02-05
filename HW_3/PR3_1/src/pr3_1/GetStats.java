/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_1;
import pr2_6.Stats;
import java.util.ArrayList;

/**
 *
 * @author jtrader17
 * @version 1
 */
public class GetStats extends Stats{
    //PT -- why have this constructor if it doesn't do anything?
    public GetStats(){};
    
    /**
     * 
     * @param myList 
     * Shows min, max, and average of an ArrayList of ints
     */
    public static void showMeStats(ArrayList<Integer> myList){
        System.out.printf("The max of this set is: %d\n", getMax(myList));
        System.out.printf("The min of this set is: %d\n", getMin(myList));
        System.out.printf("The average g of this set is: %f\n", getAvg(myList));
    }
}
