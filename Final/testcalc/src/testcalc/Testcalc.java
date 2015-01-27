/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcalc;

/**
 *
 * @author Jason Trader
 */
public class Testcalc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            Double d = Calc.calculate("2*var+3*vara+varb");
            Double u = Calc.getUnc("2*var+3*vara+varb");
            System.out.println(d);
            System.out.println(u);
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
    }
    
}
