/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_1;

import java.util.ArrayList;

/**
 *
 * @author jtrader17
 */
public class Herd {
    protected ArrayList<Gerbil> herdOfGerbils = new ArrayList<Gerbil>();
    
    public Herd(){};
    
    public void formTheHerd(int num){
        for(int i = 0; i<num; i++){
            Gerbil g = new Gerbil(i);
            herdOfGerbils.add(g);
        }
    }
    
    public void seeThemHop(){
        for (Gerbil g : herdOfGerbils){
            g.hop();
        }
    }
}
