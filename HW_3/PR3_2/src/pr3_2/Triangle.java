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
public class Triangle extends Shape{
    private int s1, s2, s3;
    
    /**
     * 
     * @param s1
     * @param s2
     * @param s3
     * @throws IllegalArgumentException 
     * Takes in three sides of triangle and makes sure all three together make a valid triangle
     */
    public Triangle(int s1, int s2, int s3) throws IllegalArgumentException {
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        if (s1 >= (s2 + s3) || s2 >= (s1 + s3) || s3 >= (s1 + s2))
            throw new IllegalArgumentException("One side cannot be greater or equal to the other two sides combined.");
        if (s1 <= 0 || s2 <=0 || s3 <= 0)
            throw new IllegalArgumentException("Cannot have a side less than or equal to zero");
    }
    
    /**
     * 
     * @return perimeter of triangle
     */
    @Override
    public double getPerimeter(){
        return s1+s2+s3;
    }
    
    /**
     * 
     * @return area of triangle
     */
    @Override
    public double getArea(){
        double p = 1.0*getPerimeter()/2.0;
        return Math.sqrt(p*(p-s1)*(p-s2)*(p-s3)); 
    }
    
    /**
     * 
     * @return string representation of triangle
     */
    @Override
    public String toString(){
        return String.format("This is a triangle with sides %d, %d, and %d", s1, s2, s3);
    }
    
    
}
