/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package number.guessing.game;

import java.util.Random;
import javax.swing.JOptionPane;

/**
 *
 * @author MD.Abdullah Al-Rakib
 */
public class frmPlayer extends javax.swing.JFrame {

    /**
     * Creates new form frmPlayer
     */
    Random randomNumberGenerator =new Random();
    public frmPlayer() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtStartingNumber = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtEndingNumber = new javax.swing.JTextField();
        btnClear = new javax.swing.JButton();
        btnGuess = new javax.swing.JButton();
        txtUserGuess = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtComputerGuess = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setText("Starting Number");

        jLabel2.setText("Ending Number");

        btnClear.setText("Clear Guess");
        btnClear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnClearMouseClicked(evt);
            }
        });

        btnGuess.setText("Guess New Number");
        btnGuess.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuessMouseClicked(evt);
            }
        });

        jLabel3.setText("User Guess");

        jLabel4.setText("Computer Guess");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtUserGuess)
                        .addComponent(btnClear, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtStartingNumber))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 265, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtEndingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtComputerGuess, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(btnGuess, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                .addGap(76, 76, 76))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtStartingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtEndingNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnClear, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUserGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtComputerGuess, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnClearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnClearMouseClicked
        txtUserGuess.setText("");
        txtComputerGuess.setText("");
    }//GEN-LAST:event_btnClearMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       int startingNumber=Integer.valueOf(txtStartingNumber.getText());
        randomNumberGenerator.setSeed(startingNumber);
    }//GEN-LAST:event_formWindowOpened

    private void btnGuessMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuessMouseClicked
        
        if (txtStartingNumber.getText().equals("") == true){
         JOptionPane.showMessageDialog(null,"Please enter Starting Number!");
        }
        else if (txtEndingNumber.getText().equals("") == true){
         JOptionPane.showMessageDialog(null,"please enter Ending Number!");
        }
        else if (Integer.valueOf(txtStartingNumber.getText()) >= Integer.valueOf(txtEndingNumber.getText())){
         JOptionPane.showMessageDialog(null,"Starting number can not be greater than or equal to ending number");
        }
        else if (txtUserGuess.getText().equals("") == true){
         JOptionPane.showMessageDialog(null,"Please Enter your Guess");
        }
        else if (Integer.valueOf(txtUserGuess.getText()) <Integer.valueOf(txtStartingNumber.getText())  ){
         JOptionPane.showMessageDialog(null,"User Guess can not be less than starting Number!");
        }
         else if (Integer.valueOf(txtUserGuess.getText()) >Integer.valueOf(txtEndingNumber.getText())  ){
         JOptionPane.showMessageDialog(null,"User Guess can not be greater than ending  Number!");
         }
         else{
         
         int endingNumber=Integer.valueOf(txtEndingNumber.getText());
        int newNumber=randomNumberGenerator.nextInt(endingNumber);
        
        txtComputerGuess.setText(String.valueOf(newNumber));
        
        if(txtUserGuess.getText().equals(txtComputerGuess.getText()) == true){
            JOptionPane.showMessageDialog(null,"Congratulations,You Have Won!");
        }
        else{
            JOptionPane.showMessageDialog(null,"Sorry you have lost.Try Again!");
        }
        
         }
        
        
        
        
        
    }//GEN-LAST:event_btnGuessMouseClicked

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
            java.util.logging.Logger.getLogger(frmPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmPlayer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmPlayer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnGuess;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtComputerGuess;
    private javax.swing.JTextField txtEndingNumber;
    private javax.swing.JTextField txtStartingNumber;
    private javax.swing.JTextField txtUserGuess;
    // End of variables declaration//GEN-END:variables
}
