/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;
import java.util.TimerTask;

/**
 *
 * @author jtrader17
 */
public class MakeNew extends TimerTask{
    @Override
    public void run(){
        TestForm t1 = new TestForm();
         t1.addWindowListener(TestForm.exit);
         TestForm t2 = new TestForm();
         t2.addWindowListener(TestForm.exit);
         TestForm t3 = new TestForm();
         t3.addWindowListener(TestForm.exit);
         t1.setVisible(true);
         t2.setVisible(true);
         t3.setVisible(true);
    }
}
