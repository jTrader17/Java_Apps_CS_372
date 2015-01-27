/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testcalc;
import java.util.Scanner;

/**
 *
 * @author Jason Trader
 */
public class Variable {
    private double value, uncertainty;
    private String name;
    
    public Variable(String v){
        Scanner my = new Scanner(System.in);
        name = v;
        System.out.printf("What is the value of %s?\n", name);
        value = my.nextDouble();
        System.out.printf("What is the uncertainty of %s?\n", name);
        uncertainty = my.nextDouble();
    }
    
    public String getName(){
        return name;
    }
    
    public double getValue(){
        return value;
    }
    
    public double getUnc(){
        return uncertainty;
    }
}
