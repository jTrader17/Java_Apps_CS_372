/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr1_4;
import java.util.Scanner;

/**
 *
 * @author jTrader17
 * @version 1
 * Contains main function which computes area of a circle
 */
public class PR1_4 {

    /**
     * @param args the command line arguments
     * Takes in the radius of a circle and prints the area of the circle
     */
    public static void main(String[] args) {
        final double pi = 3.14; //PT: use java.lang.Math.PI
        System.out.print("Please enter a radius of a circle: ");
        Scanner input = new Scanner(System.in);
        double rad = input.nextDouble();
        System.out.printf("The area of the circle is : %f\n", rad*rad*pi);
    }
    
}
