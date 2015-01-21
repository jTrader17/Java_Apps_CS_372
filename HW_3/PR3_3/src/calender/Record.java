/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calender;

/**
 *
 * @author jTrader17
 */
public class Record {
    private Object[] myData;
    
    /**
     * 
     * @return date of the record
     */
    public String getDate(){
        return myData[0].toString();
    }
    
    /**
     * 
     * @return the whole record
     */
    public Object[] getAllData(){
        return myData;
    }
    
    /**
     * 
     * @param data 
     * takes an array of objects and makes it a record
     */
    public Record(Object[] data){
        myData = data;
    }
    
}
