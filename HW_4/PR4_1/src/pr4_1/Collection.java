/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.HashMap;
import java.util.Set;
import java.util.ArrayList;

/**
 *
 * @author jTrader17
 */
public class Collection {
    private static HashMap<String, Info> myReviews = new HashMap(0);
    
    public static void addReview(Info i){
        myReviews.put(i.getName(), i);
    }
    
    public static Info getInfo(String s){
        return myReviews.get(s);
    }
    
    public static Set<String> getRestaurants(){
        return myReviews.keySet();
    }
    
    public static void output (ArrayList<String> my){
        File myFile = new File("myFile.txt") ;  
        try{
           BufferedWriter wrtr = new BufferedWriter(new FileWriter(myFile));
           for(int i= 0; i<my.size(); i++){
            Info in = myReviews.get(my.get(i));
               wrtr.write(in.getName());
               wrtr.newLine();
               wrtr.write(in.getAddress());
               wrtr.newLine();
               wrtr.write(in.getRating().toString());
               wrtr.newLine();
               wrtr.write(in.getNotes());
               wrtr.newLine();
           }
           wrtr.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
        
    }
    
    public static void input(){
        File myFile = new File("myFile.txt");
        String notes = "", rating ="", address ="", name="";
        int i = 0;
        try{
            if(myFile.exists()){
                BufferedReader rdr = new BufferedReader(new FileReader(myFile));
                   while ((notes = rdr.readLine()) != null){
                       if(i%4==3){ 
                          addReview(new Info(name, address, Integer.parseInt(rating), notes));
                       }
                       name = address;
                       address = rating;
                       rating = notes;
                       
                       i++;
                   }
                   rdr.close();
            }
         }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
}
