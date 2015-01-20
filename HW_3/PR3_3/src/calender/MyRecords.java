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
    
    public static ArrayList<Record> getSorted(){
        ArrayList<Record> sorted = new ArrayList();
        ArrayList<String> sortedDate = new ArrayList();
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
    
    public static void addRecord(Record r){
        records.put(r.getDate(), r);
    }
    
   
    
}
