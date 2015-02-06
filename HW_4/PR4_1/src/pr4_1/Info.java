/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pr4_1;

/**
 *
 * @author jTrader17
 */
public class Info {
    private String name;
    private String address;
    private String notes;
    private int rating;
    //PT -- javadoc? -4
    public String getName(){
        return name;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getNotes(){
        return notes;
    }
    
    public Integer getRating(){
        return rating;
    }
    
    public Info(String name, String address, int rating, String notes){
        this.name=name;
        this.address=address;
        this.rating=rating; //PT -- Make sure rating in [1,5]
        this.notes=notes;
    }
    
}
