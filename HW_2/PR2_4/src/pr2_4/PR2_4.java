/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_4;

/**
 *
 * @author jtrader17
 */
public class PR2_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //PT -- check to make sure args.length > 0
        int numTerms = Integer.parseInt(args[0]);
        Calculate.CalculatePi(numTerms);
    }
    
}
