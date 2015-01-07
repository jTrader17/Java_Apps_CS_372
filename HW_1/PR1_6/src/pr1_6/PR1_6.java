/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_6;

/**
 *
 * @author jTrader17
 * @version 1
 * Contains main function which calculates first 25 primes
 */
public class PR1_6 {

    /**
     * @param args the command line arguments
     * This function checks for the first 25 prime numbers.
     */
    public static void main(String[] args) {
        int count = 0;
        int i = 2;
        System.out.println("First 25 prime numbers:");
        while(count !=25){
            boolean composite = false;
            for (int j=2; j<i; j++){
                if (i%j == 0){
                    composite = true;
                    break;
                }
            }
            if (!composite){
                System.out.printf("%d ", i);
                count ++;
            }
            i++;
            
        }
        System.out.print("\n");
    }
    
}
