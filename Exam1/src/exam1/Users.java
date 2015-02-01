/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1;
import java.util.HashMap;
import java.io.*;
import java.util.Set;

/**
 *
 * @author jtrader17
 * @version 1
 */
public class Users {
    private static HashMap<String, Integer> users = new HashMap(0); //stores all names and the money they have
    
    public Users(){
    }
    
    /**
     * 
     * @param name 
     * Adds an account with 500 dollars in it for the name specified
     */
    public static void addUser(String name){
        users.put(name, 500);
    }
    
    /**
     * 
     * @param name
     * @return total cash the user has
     */
    public static Integer findUserTotal (String name){
        return users.get(name);
    }
    
    /**
     * 
     * @param name
     * @return whether or not the user exists
     */
    public static boolean userExists(String name){
        return users.containsKey(name);
    }
    
    /**
     * 
     * @param name
     * @param amt 
     * adds <code>amt</code> to name's total
     */
    public static void updateUserTotal(String name, int amt){
        int previous = users.get(name);
        users.remove(name);
        users.put(name, previous+amt);
    }
    
    /**
     * Outputs all user's and their totals to a text file
     */
    public static void cleanup(){
        File myFile = new File("myFile.txt") ;
        Set<String> keys = users.keySet();
        try{
           BufferedWriter wrtr = new BufferedWriter(new FileWriter(myFile));
           for(String name : keys){
               wrtr.write(name);
               wrtr.newLine();
               wrtr.write(users.get(name).toString());
               wrtr.newLine();
           }
           wrtr.close();
        }
        catch(Exception ex){
            System.out.println(ex.getMessage());
        }
    }
    
    /**
     * retrieves all names and their totals from a text file
     */
    public static void initialize(){
        String first, second = "";
        File myFile = new File("myFile.txt") ;
        int i = 0;
        try{
            if(myFile.exists()){
                BufferedReader rdr = new BufferedReader(new FileReader(myFile));
                   while ((first = rdr.readLine()) != null){
                       if(i%2==1){ //at this point first should have total and second should have the name
                           //Only every other time because two lines need to be read
                           users.put(second, Integer.parseInt(first));
                       }
                       second = first;
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
