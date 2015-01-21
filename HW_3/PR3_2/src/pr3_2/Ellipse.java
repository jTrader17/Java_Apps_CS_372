/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;

/**
 *
 * @author jtrader17
 * @version 1
 */
public class Ellipse extends Shape{
    private int r1, r2;
    
    /**
     * 
     * @param r1
     * @param r2
     * @throws IllegalArgumentException
     * takes in twos axis lengths and determines if they are greater than 0
     */
    public Ellipse(int r1, int r2) throws IllegalArgumentException {
        this.r1 = r1;
        this.r2 = r2;
        if (r1 <= 0 || r2 <=0)
            throw new IllegalArgumentException("Cannot have an axis less than or equal to zero");
    }
    
    
    /**
     * 
     * @return Perimeter of Ellipse (estimate)
     */
    @Override
    public double getPerimeter(){
        return 2.0*Math.PI*Math.sqrt((r1*r1+r2*r2)/2);
    }
    
    /**
     * 
     * @return Area of Ellipse
     */
    @Override
    public double getArea(){
        return Math.PI*r1*r2;
    }
    
    /**
     * 
     * @return String model of Ellipse
     */
    @Override
    public String toString(){
        return String.format("This is an ellipse with an axis length: %d and an axis length: %d", r1, r2);
    }
}
