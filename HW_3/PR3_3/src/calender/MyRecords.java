/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calender;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/**
 *
 * @author jTrader17
 */
public class MyRecords {
    private static HashMap<String, Record> records = new HashMap(0);
    
    /**
     * 
     * @return sorted ArrayList of Records by date
     */
     //PT -- I wanted you to use the Comparator approach here. This works, but not optimal -3
    public static ArrayList<Record> getSorted(){
        ArrayList<Record> sorted = new ArrayList();
        ArrayList<String> sortedDate = new ArrayList();
        //Date is the key
        Set<String> kset = records.keySet();
        for(String date : kset){
            sortedDate.add(date);
        }
        Collections.sort(sortedDate);
        for(String date : sortedDate){
            sorted.add(records.get(date));
        }
        return sorted;
    }
    
    /**
     * 
     * @param r 
     * adds the record r
     */
    public static void addRecord(Record r){
        records.put(r.getDate(), r);
    }
    
   
    
}
