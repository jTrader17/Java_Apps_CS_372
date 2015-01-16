/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author jtrader17
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /* WindowListener exitListen = new WindowAdapter(){
        @Override
        public void windowClosing(WindowEvent e){
            TestForm t1 = new TestForm();
            
            TestForm t2 = new TestForm();
            
            TestForm t3 = new TestForm();
            
            t1.setVisible(true);
            t2.setVisible(true);
            t3.setVisible(true);
        }
    };*/
        
        TestForm my = new TestForm();
        my.addWindowListener(TestForm.exit);
        my.setVisible(true);
        
    }
    
}
