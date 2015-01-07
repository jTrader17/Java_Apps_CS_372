/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_5;
import java.util.Random;

/**
 *
 * @author jTrader17
 * @version 1
 * Needs the imported random class
 * Contains main class which compares random numbers.
 */
public class PR1_5 {

    /**
     * @param args the command line arguments
     * Generates a random number and then compares that number to 25 more randomly generated numbers
     * The program then prints whether the number is less than, equal to, or greater than the test
     */
    public static void main(String[] args) {
        Random myRandom = new Random();
        int testCase = myRandom.nextInt();
        for(int i=0; i<25; i++){
            int temp = myRandom.nextInt();
            if (temp == testCase)
                System.out.printf("%d number equals the test case\n", i+1);
            if (temp < testCase)
                System.out.printf("%d number is less than the test case\n", i+1);
            if (temp > testCase)
                System.out.printf("%d number is greater than the test case\n", i+1);
        }
    }
    
}
