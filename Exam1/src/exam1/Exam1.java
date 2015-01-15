/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1;

/**
 *
 * @author jtrader17
 */
public class Exam1 {

    /**
     * @param args the command line arguments
     * @version 1
     */
    public static void main(String[] args) {
        Users.initialize(); //Initializes all users who have played before back into the system
        OverUnder myProject = new OverUnder();
        myProject.setVisible(true);
    }
    
}
