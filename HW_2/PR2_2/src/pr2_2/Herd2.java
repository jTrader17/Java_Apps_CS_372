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
    
    public void seeThemHop(){
        Iterator<Gerbil> myIt = herdOfGerbils.iterator();
        do{
            Gerbil g = myIt.next();
            g.hop();
        } while(myIt.hasNext());
            
    }
}