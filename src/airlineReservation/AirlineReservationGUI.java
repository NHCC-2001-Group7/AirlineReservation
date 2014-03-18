
package airlineReservation;

/**
 * @author: Mike Plucker, Billy Lam, Xavier Porter
 * Class: CSCI 2001-51
 * Due Date: 03/31/14
 * 
 * Version: 1.00
 * 
 * 
 * Generates the GUI for the MathGame
 */


//import classes
import java.awt.Color;
import java.io.*;


public class AirlineReservationGUI extends javax.swing.JFrame {
    
    //create AirlineReservation object
    AirlineReservation airline = new AirlineReservation();
    

    /**
     * Creates new form AirlineReservationGUI
     */
    public AirlineReservationGUI() {
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

        button1A = new javax.swing.JToggleButton();
        button1B = new javax.swing.JToggleButton();
        button1C = new javax.swing.JToggleButton();
        button1D = new javax.swing.JToggleButton();
        button2A = new javax.swing.JToggleButton();
        button2B = new javax.swing.JToggleButton();
        button2C = new javax.swing.JToggleButton();
        button2D = new javax.swing.JToggleButton();
        button3A = new javax.swing.JToggleButton();
        button3B = new javax.swing.JToggleButton();
        button3C = new javax.swing.JToggleButton();
        button3D = new javax.swing.JToggleButton();
        button3E = new javax.swing.JToggleButton();
        button3F = new javax.swing.JToggleButton();
        button4A = new javax.swing.JToggleButton();
        button4B = new javax.swing.JToggleButton();
        button4C = new javax.swing.JToggleButton();
        button4D = new javax.swing.JToggleButton();
        button4E = new javax.swing.JToggleButton();
        button4F = new javax.swing.JToggleButton();
        button5A = new javax.swing.JToggleButton();
        button5B = new javax.swing.JToggleButton();
        button5C = new javax.swing.JToggleButton();
        button5D = new javax.swing.JToggleButton();
        button5E = new javax.swing.JToggleButton();
        button5F = new javax.swing.JToggleButton();
        EnterNameLabel = new javax.swing.JLabel();
        NameTextField = new javax.swing.JTextField();
        ChooseSeatLabel = new javax.swing.JLabel();
        HitAcceptLabel = new javax.swing.JLabel();
        ACCEPTbutton = new javax.swing.JButton();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vay Cay Shun Airlines");
        setMaximumSize(new java.awt.Dimension(670, 656));
        setMinimumSize(new java.awt.Dimension(670, 656));
        getContentPane().setLayout(null);

        button1A.setText("1 A");
        button1A.setToolTipText("");
        button1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1AActionPerformed(evt);
            }
        });
        getContentPane().add(button1A);
        button1A.setBounds(316, 444, 48, 48);

        button1B.setText("1 B");
        getContentPane().add(button1B);
        button1B.setBounds(366, 444, 48, 48);

        button1C.setText("1 C");
        getContentPane().add(button1C);
        button1C.setBounds(458, 444, 48, 48);

        button1D.setText("1 D");
        getContentPane().add(button1D);
        button1D.setBounds(506, 444, 48, 48);

        button2A.setText("2 A");
        getContentPane().add(button2A);
        button2A.setBounds(316, 394, 48, 48);

        button2B.setText("2 B");
        getContentPane().add(button2B);
        button2B.setBounds(366, 394, 48, 48);

        button2C.setText("2 C");
        getContentPane().add(button2C);
        button2C.setBounds(458, 394, 48, 48);

        button2D.setText("2 D");
        getContentPane().add(button2D);
        button2D.setBounds(506, 394, 48, 48);
        getContentPane().add(button3A);
        button3A.setBounds(312, 321, 36, 36);

        button3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button3BActionPerformed(evt);
            }
        });
        getContentPane().add(button3B);
        button3B.setBounds(348, 320, 36, 38);
        getContentPane().add(button3C);
        button3C.setBounds(384, 320, 36, 38);
        getContentPane().add(button3D);
        button3D.setBounds(450, 320, 36, 36);
        getContentPane().add(button3E);
        button3E.setBounds(486, 320, 36, 36);
        getContentPane().add(button3F);
        button3F.setBounds(522, 320, 36, 36);
        getContentPane().add(button4A);
        button4A.setBounds(312, 286, 36, 36);
        getContentPane().add(button4B);
        button4B.setBounds(348, 286, 36, 36);
        getContentPane().add(button4C);
        button4C.setBounds(384, 286, 36, 36);
        getContentPane().add(button4D);
        button4D.setBounds(450, 284, 36, 36);
        getContentPane().add(button4E);
        button4E.setBounds(486, 284, 36, 36);
        getContentPane().add(button4F);
        button4F.setBounds(522, 284, 36, 36);

        button5A.setBorderPainted(false);
        button5A.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button5A.setRolloverEnabled(false);
        button5A.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageDisplay/Airline Green Button.jpg"))); // NOI18N
        getContentPane().add(button5A);
        button5A.setBounds(312, 250, 36, 36);
        getContentPane().add(button5B);
        button5B.setBounds(348, 250, 36, 36);
        getContentPane().add(button5C);
        button5C.setBounds(384, 250, 36, 36);
        getContentPane().add(button5D);
        button5D.setBounds(450, 250, 36, 36);
        getContentPane().add(button5E);
        button5E.setBounds(486, 250, 36, 36);
        getContentPane().add(button5F);
        button5F.setBounds(522, 250, 36, 36);

        EnterNameLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        EnterNameLabel.setText("Please Enter Your Name");
        getContentPane().add(EnterNameLabel);
        EnterNameLabel.setBounds(28, 118, 230, 26);

        NameTextField.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        NameTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NameTextFieldActionPerformed(evt);
            }
        });
        getContentPane().add(NameTextField);
        NameTextField.setBounds(26, 142, 252, 30);

        ChooseSeatLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        ChooseSeatLabel.setText("Please Choose a Seat on the Plane");
        getContentPane().add(ChooseSeatLabel);
        ChooseSeatLabel.setBounds(28, 178, 248, 34);

        HitAcceptLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        HitAcceptLabel.setText("Hit Accept");
        getContentPane().add(HitAcceptLabel);
        HitAcceptLabel.setBounds(28, 214, 242, 28);

        ACCEPTbutton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        ACCEPTbutton.setText("ACCEPT");
        getContentPane().add(ACCEPTbutton);
        ACCEPTbutton.setBounds(60, 252, 174, 52);

        background.setBackground(new java.awt.Color(153, 255, 153));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageDisplay/Airline 14.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -50, 740, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button3BActionPerformed

    private void button1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1AActionPerformed
        airline.selectFirstClass(0);
        
    }//GEN-LAST:event_button1AActionPerformed

    private void NameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NameTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NameTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(AirlineReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AirlineReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AirlineReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AirlineReservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new AirlineReservationGUI().setVisible(true);
            }
        });
        
        
    }
    
    private void button5A(java.awt.event.ActionEvent evt) {                                             
        setUpButton(); //call method to set-up button
        
        button5A.setBackground(Color.green); 
    }                              

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ACCEPTbutton;
    private javax.swing.JLabel ChooseSeatLabel;
    private javax.swing.JLabel EnterNameLabel;
    private javax.swing.JLabel HitAcceptLabel;
    private javax.swing.JTextField NameTextField;
    private javax.swing.JLabel background;
    private javax.swing.JToggleButton button1A;
    private javax.swing.JToggleButton button1B;
    private javax.swing.JToggleButton button1C;
    private javax.swing.JToggleButton button1D;
    private javax.swing.JToggleButton button2A;
    private javax.swing.JToggleButton button2B;
    private javax.swing.JToggleButton button2C;
    private javax.swing.JToggleButton button2D;
    private javax.swing.JToggleButton button3A;
    private javax.swing.JToggleButton button3B;
    private javax.swing.JToggleButton button3C;
    private javax.swing.JToggleButton button3D;
    private javax.swing.JToggleButton button3E;
    private javax.swing.JToggleButton button3F;
    private javax.swing.JToggleButton button4A;
    private javax.swing.JToggleButton button4B;
    private javax.swing.JToggleButton button4C;
    private javax.swing.JToggleButton button4D;
    private javax.swing.JToggleButton button4E;
    private javax.swing.JToggleButton button4F;
    private javax.swing.JToggleButton button5A;
    private javax.swing.JToggleButton button5B;
    private javax.swing.JToggleButton button5C;
    private javax.swing.JToggleButton button5D;
    private javax.swing.JToggleButton button5E;
    private javax.swing.JToggleButton button5F;
    // End of variables declaration//GEN-END:variables

    private void setUpButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
