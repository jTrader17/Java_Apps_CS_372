/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_1;

import java.util.ArrayList;


/**
 *
 * @author jtrader17
 * @version 1
 */
public class PR3_1 {

    /**
     * @param args the command line arguments
     * Takes in 10 integers and computes min, max and avg
     */
    public static void main(String[] args) {
        ArrayList<Integer> myList = Data.getData(10);
        System.out.println();
        GetStats.showMeStats(myList);
    }
    
}
