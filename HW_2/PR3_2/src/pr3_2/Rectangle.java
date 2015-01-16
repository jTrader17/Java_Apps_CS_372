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
public class Rectangle extends Shape {
    private int height, width;
    
    public Rectangle(int height, int width) throws IllegalArgumentException {
        this.height = height;
        this.width = width;
        if (height <= 0 || width <=0)
            throw new IllegalArgumentException("Cannot have a side less than or equal to zero");
    }
    
    @Override
    public double getPerimeter(){
        return 2*height+2*width;
    }
    
    @Override
    public double getArea(){
        return height*width; 
    }
    
    @Override
    public String toString(){
        return String.format("This is a rectagle with a width length: %d and a height length: %d", width, height);
    }
}
