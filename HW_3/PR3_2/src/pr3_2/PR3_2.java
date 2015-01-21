/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr3_2;
import java.util.ArrayList;

/**
 *
 * @author jtrader17
 */
public class PR3_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            ArrayList<Shape> myShapes = new ArrayList();
            myShapes.add(new Rectangle(4, 3));
            myShapes.add(new Triangle(2,3,3));
            myShapes.add(new Ellipse(4,3));
            
            //base class shape has all of these functions
            for (Shape s : myShapes){
                System.out.println(s.getArea());
                System.out.println(s.getPerimeter());
                System.out.println(s.toString());
            }
        }
        catch(IllegalArgumentException ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
}
