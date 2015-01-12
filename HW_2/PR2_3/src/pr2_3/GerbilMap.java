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
import pr2_3.GerbilsWName;
import java.util.HashMap;
import java.util.Set;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.Scanner;


public class GerbilMap {
    protected HashMap <String, GerbilsWName> myMap = new HashMap(0);
    
    public GerbilMap(){}
    
    public ArrayList<String> getGerbilNames(){
        //Get the gerbil names
        ArrayList<String> myGerbils = new ArrayList();
        System.out.println("Print gerbil name then enter to add a gerbil with that name");
        System.out.println("Enter \"stop\" to stop");
        Scanner myScan = new Scanner(System.in);
        while(true){
            String temp = myScan.next();
            if (temp.toLowerCase().equals("stop")){
                break;
            }
            myGerbils.add(temp);
        }
        return myGerbils;
    }
        //PT -- javadocs. -2
    public void addGerbils(ArrayList<String> myGerbils){
        //put the gerbils in a map
        int i = 0;
        for(String s : myGerbils){
            GerbilsWName g = new GerbilsWName(i, s);
            i++;
            myMap.put(s, g);
        }
    }
    
    public void seeThemHop(){
        Set<String> myGerbilNames = myMap.keySet();
        Iterator<String> myIt= myGerbilNames.iterator();
        if (!myIt.hasNext()){
            System.out.println("No gerbils:(");
        }
        else{
            do{
                myMap.get(myIt.next()).hop();
            } while (myIt.hasNext());
        }
    }
}
