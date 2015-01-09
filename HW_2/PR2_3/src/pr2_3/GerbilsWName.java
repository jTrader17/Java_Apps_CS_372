package pr2_3;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jtrader17
 */
import pr2_1.*;


public class GerbilsWName extends Gerbil{
    private String name;
    public String getName(){
        return name;
    }
    
    public GerbilsWName(int num, String name){
        this.gerbilNumber = num;
        this.name = name;
    }
    
    public void hop(){
        System.out.printf("I'm gebil %d named %s and I'm hoping\n", gerbilNumber+1, name);
    }
    
    
}
