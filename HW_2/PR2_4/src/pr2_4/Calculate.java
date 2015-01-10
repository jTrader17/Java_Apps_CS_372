package pr2_4;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jtrader17
 */
public class Calculate {
    public Calculate(){}
    
    public static void CalculatePi(int numTerms){
        double pi = 0.0;
        double nextTerm;
        for (int i = 0; i < numTerms; i++){
            nextTerm = 4.0/(2*i+1);
            if (i%2==1){
                nextTerm *= -1;
            }
            pi += nextTerm;
            System.out.printf("%d term is:\t%f\n", i+1, pi);
        }
    }
}
