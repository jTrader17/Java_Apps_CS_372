package pr2_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import pr2_1.*;
import java.util.Iterator;

/**
 *
 * @author jtrader17
 */
public class Herd2 extends Herd {
    
    public Herd2(){};
    //PT -- javadocs ... -2
    public void seeThemHop(){
        Iterator<Gerbil> myIt = herdOfGerbils.iterator();
        if (!myIt.hasNext()){
            System.out.println("No gerbils :(");
        }
        else{
            do{
                //PT -- you could even do myIt.next().hop();
              Gerbil g = myIt.next();
              g.hop();
            } while(myIt.hasNext());
        }
            
    }
}