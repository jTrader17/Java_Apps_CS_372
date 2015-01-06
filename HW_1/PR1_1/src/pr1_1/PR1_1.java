/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_1;

/**
 *
 * @author jTrader17
 */

public class PR1_1 {

   
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DataOnly d = new DataOnly();
        d.i = 47;
        d.f = 1.1f;
        d.b = false;
        System.out.printf("integer is: %d\n", d.i);
        System.out.printf("Float value is: %f\n", d.f);
        System.out.printf("Boolean is: %s\n", d.b);
        
        
    }
    
}
