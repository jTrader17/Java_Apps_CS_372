/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr2_3;


/**
 *
 * @author jtrader17
 */
public class PR2_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        GerbilMap myMap = new GerbilMap();
        myMap.addGerbils(myMap.getGerbilNames());
        myMap.seeThemHop(); 
    }
    
}
