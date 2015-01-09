/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_1;

/**
 *
 * @author jtrader17
 */
public class Gerbil {
    protected int gerbilNumber;
    
    public Gerbil(){};
    public Gerbil(int gNum){
        this.gerbilNumber = gNum;
    }
    public void hop(){
        System.out.printf("I'm number %d and I'm hoping\n", this.gerbilNumber + 1);
    }
}
