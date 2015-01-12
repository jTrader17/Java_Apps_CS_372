/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_1;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jtrader17
 * @version 1
 */
public class Data {
    Data(){};
    
    /**
     * 
     * @param numItems integer of the amount of items you want to get
     * @return myList an ArrayList of all the numbers
     * process checks to make sure all entries are integers
     */
    public static ArrayList<Integer> getData(int numItems){
        Scanner myScan = new Scanner(System.in);
        ArrayList<Integer> myList = new ArrayList<>();
        for(int i = 0; i<numItems; i++){
            boolean cont;
            do{
                cont = true;
                System.out.printf("%d number please (integer): ", i+1);
                int temp;
                try{
                   temp = myScan.nextInt();
                   myList.add(temp);
                }
                catch(Exception ex){
                    myScan.nextLine();
                    System.out.println("Give me an integer please.");
                    cont = false;
                }
            }while(!cont);
        }
        return myList;
    }
}
