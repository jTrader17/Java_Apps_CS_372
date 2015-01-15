/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exam1;
import java.util.Random;

/**
 *
 * @author jtrader17
 */
public class MainInterface extends javax.swing.JFrame {

    /**
     * Creates new form MainInterface
     */
    private String username;
    private Random myRandom = new Random();
    /**
     * 
     * @param username 
     * assigns username to be the username for this session
     */
    public MainInterface(String username) {
        initComponents();
        this.username = username;
        greeting.setText("Hello " + username + "!");
        if (!Users.userExists(username)){
            Users.addUser(username);
        }
        theMoney.setText("$" + Users.findUserTotal(username).toString());//outputs the amount the user has
        diceDisplay.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        greeting = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        theMoney = new javax.swing.JLabel();
        over = new javax.swing.JRadioButton();
        under = new javax.swing.JRadioButton();
        seven = new javax.swing.JRadioButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        userBid = new javax.swing.JTextPane();
        jButton1 = new javax.swing.JButton();
        diceDisplay = new javax.swing.JLabel();
        outcome = new javax.swing.JLabel();
        userOutcome = new javax.swing.JLabel();
        error = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("You have:");

        over.setText("Over 7");
        over.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overActionPerformed(evt);
            }
        });

        under.setText("Under 7");
        under.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                underActionPerformed(evt);
            }
        });

        seven.setText("7");
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });

        jLabel2.setText("Your Bid:");

        jScrollPane1.setViewportView(userBid);

        jButton1.setText("Roll The Dice");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(greeting, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(138, 138, 138)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(theMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                                        .addComponent(jScrollPane1))
                                    .addComponent(outcome, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userOutcome, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(under)
                                    .addComponent(over)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(seven)
                                        .addGap(73, 73, 73)
                                        .addComponent(jButton1))
                                    .addComponent(diceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(theMoney, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(greeting, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(over)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(under))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seven)
                            .addComponent(jButton1))
                        .addGap(18, 18, 18)
                        .addComponent(diceDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(outcome)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(userOutcome)))
                .addGap(68, 68, 68)
                .addComponent(error, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
/**
 * 
 * @param evt 
 * makes sure only one button is selected
 */
    private void overActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overActionPerformed
        under.setSelected(false);
        seven.setSelected(false);
    }//GEN-LAST:event_overActionPerformed
/**
 * 
 * @param evt 
 * makes sure only one button is selected
 */
    private void underActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_underActionPerformed
        over.setSelected(false);
        seven.setSelected(false);
    }//GEN-LAST:event_underActionPerformed
/**
 * 
 * @param evt 
 * makes sure only one button is selected
 */
    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        under.setSelected(false);
        over.setSelected(false);
    }//GEN-LAST:event_sevenActionPerformed
/**
 * 
 * @param evt
 * checks whether user wins and displays information
 */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        diceDisplay.setVisible(true);
        userOutcome.setVisible(true);
        error.setVisible(false);
        Integer diceTotal = getTotal(); //gets total of two dice
        checkWinner(diceTotal);//Checks to see if user won or not and updates their info
        theMoney.setText("$" + Users.findUserTotal(username).toString());
        diceDisplay.setText("Dice Total: " + diceTotal.toString());
        Users.cleanup();//adds names and totals to a text file
    }//GEN-LAST:event_jButton1ActionPerformed
     /**
      * 
      * @return total of two dice
      */   
    private int getTotal(){
        int die1, die2;
        die1 = myRandom.nextInt(6) + 1;
        die2 = myRandom.nextInt(6) + 1;
        return die1 + die2;
    }
    /**
     * 
     * @param diceTotal
     * Checks to see if user wins or not and updates their info
     */
    private void checkWinner(int diceTotal){
        try{
            int bid = Integer.parseInt(userBid.getText());
            if (over.isSelected()){
               if (diceTotal > 7){
                    Users.updateUserTotal(username, bid);
                    userOutcome.setText("You Won!");
                }
                else{
                    Users.updateUserTotal(username, -bid);//user loses bid
                    userOutcome.setText("You Lost!");
                }
            }
            if (under.isSelected()){
                if (diceTotal < 7){
                    Users.updateUserTotal(username, bid);
                    userOutcome.setText("You Won!");
                }
                else{
                    Users.updateUserTotal(username, -bid);//user loses bid
                    userOutcome.setText("You Lost!");
                }
            }
            if (seven.isSelected()){
                if (diceTotal == 7){
                    Users.updateUserTotal(username, 4*bid);//special case for 7 user gains 4 times the bid
                    userOutcome.setText("You Won!");
                }
                else{
                    Users.updateUserTotal(username, -bid);//user loses bid
                    userOutcome.setText("You Lost!");
                }
            }
        }
        catch (NumberFormatException ex){//Exception is expected to be frome the Integer.parseInt function
            error.setText("Please enter an integer for your bid");
            error.setVisible(true);
            userOutcome.setVisible(false);
            diceDisplay.setVisible(false);
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainInterface("").setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.JLabel diceDisplay;
    private javax.swing.JLabel error;
    private javax.swing.JLabel greeting;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel outcome;
    private javax.swing.JRadioButton over;
    private javax.swing.JRadioButton seven;
    private javax.swing.JLabel theMoney;
    private javax.swing.JRadioButton under;
    private javax.swing.JTextPane userBid;
    private javax.swing.JLabel userOutcome;
    // End of variables declaration//GEN-END:variables
}
