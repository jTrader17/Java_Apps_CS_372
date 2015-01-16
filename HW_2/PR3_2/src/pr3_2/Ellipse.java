/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;

/**
 *
 * @author jtrader17
 */
public class Ellipse extends Shape{
    private int r1, r2;
    
    public Ellipse(int r1, int r2) throws IllegalArgumentException {
        this.r1 = r1;
        this.r2 = r2;
        if (r1 <= 0 || r2 <=0)
            throw new IllegalArgumentException("Cannot have an axis less than or equal to zero");
    }
    
    @Override
    public double getPerimeter(){
        return 2.0*Math.PI*Math.sqrt((r1*r1+r2*r2)/2);
    }
    
    @Override
    public double getArea(){
        return Math.PI*r1*r2;
    }
    
    @Override
    public String toString(){
        return String.format("This is an ellipse with an axis length: %d and an axis length: %d", r1, r2);
    }
}
