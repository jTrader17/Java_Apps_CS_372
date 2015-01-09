package pr2_2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
import pr2_1.Gerbil;

/**
 *
 * @author jtrader17
 */
public class Herd {
    private ArrayList<Gerbil> herdOfGerbils = new ArrayList<Gerbil>();
    
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