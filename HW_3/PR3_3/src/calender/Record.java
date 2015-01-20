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
    public String getDate(){
        return myData[0].toString();
    }
    public Object[] getAllData(){
        return myData;
    }
    public Record(Object[] data){
        myData = data;
    }
    
}
