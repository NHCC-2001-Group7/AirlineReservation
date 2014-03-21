
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
import javax.swing.ImageIcon;
import java.io.*;
import javax.swing.JToggleButton;

public class AirlineReservationGUI extends javax.swing.JFrame {
    
    //create AirlineReservation object
    AirlineReservation airline = new AirlineReservation();
    JToggleButton[] buttons = new JToggleButton[5];
   
    //declare customer object
    Customer customer;
    
    //declare field variables
    private String firstName, lastName, seat;
    

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
        enterFirstNameLabel = new javax.swing.JLabel();
        enterLastNameLabel = new javax.swing.JLabel();
        firstNameTextField = new javax.swing.JTextField();
        lastNameTextField = new javax.swing.JTextField();
        selectSeatLabel = new javax.swing.JLabel();
        acceptLabel = new javax.swing.JLabel();
        acceptButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Vay Cay Shun Airlines");
        setMinimumSize(new java.awt.Dimension(670, 656));
        getContentPane().setLayout(null);

        button1A.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlineReservation/images/white.png"))); // NOI18N
        button1A.setText("1 A");
        button1A.setToolTipText("");
        button1A.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        button1A.setRolloverEnabled(false);
        button1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1AActionPerformed(evt);
            }
        });
        getContentPane().add(button1A);
        button1A.setBounds(316, 444, 48, 48);

        button1B.setText("1 B");
        button1B.setRolloverEnabled(false);
        getContentPane().add(button1B);
        button1B.setBounds(366, 444, 48, 48);

        button1C.setText("1 C");
        button1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1CActionPerformed(evt);
            }
        });
        getContentPane().add(button1C);
        button1C.setBounds(458, 444, 48, 48);

        button1D.setText("1 D");
        button1D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                button1DActionPerformed(evt);
            }
        });
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
        getContentPane().add(button5A);
        button5A.setBounds(312, 250, 36, 36);

        button5B.setRolloverEnabled(false);
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

        enterFirstNameLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        enterFirstNameLabel.setText("First Name:");
        getContentPane().add(enterFirstNameLabel);
        enterFirstNameLabel.setBounds(28, 118, 90, 26);

        enterLastNameLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        enterLastNameLabel.setText("Last Name:");
        getContentPane().add(enterLastNameLabel);
        enterLastNameLabel.setBounds(160, 120, 90, 19);

        firstNameTextField.setFont(new java.awt.Font("Serif", 0, 14)); // NOI18N
        getContentPane().add(firstNameTextField);
        firstNameTextField.setBounds(26, 142, 110, 30);
        getContentPane().add(lastNameTextField);
        lastNameTextField.setBounds(160, 140, 120, 30);

        selectSeatLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        selectSeatLabel.setText("Please Choose a Seat on the Plane");
        getContentPane().add(selectSeatLabel);
        selectSeatLabel.setBounds(28, 178, 248, 34);

        acceptLabel.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        acceptLabel.setText("Hit Accept");
        getContentPane().add(acceptLabel);
        acceptLabel.setBounds(28, 214, 242, 28);

        acceptButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        acceptButton.setText("ACCEPT");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(acceptButton);
        acceptButton.setBounds(60, 252, 174, 52);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageDisplay/SeatingChart3.jpg"))); // NOI18N
        jTabbedPane1.addTab("Help", jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageDisplay/About.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jTabbedPane1.addTab("About", jLabel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(14, 334, 194, 210);

        background.setBackground(new java.awt.Color(153, 255, 153));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImageDisplay/Airline 6.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -50, 740, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void button3BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button3BActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button3BActionPerformed

    private void button1AActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1AActionPerformed
                
        
       
        if(acceptButton.isSelected()){
            button1A.setSelected(false);
            }
        else if(button1A.isSelected()){ //If button 1A is selected
            button1A.setIcon(airline.red); //Change button Icon to green
            button1A.setSelected(false); //The Button cannot be selected again         
            
        }

        button1A.setBorder(null); 
        button1A.setFocusable(false);
        button1A.setRolloverIcon(null);
        
        
        //sets label text when button is pressed
        selectSeatLabel.setText("Seat: 1A");
        
        //sets seat value when button is pressed
        seat = "1A";
        
    }//GEN-LAST:event_button1AActionPerformed

    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
            


            if(acceptButton.isSelected()){ //If accept button is selected
                button1A.setSelected(false); //Select button cannot be selected again
                button1B.setSelected(false);
                button1C.setSelected(false);
                button1D.setSelected(false);
                button2A.setSelected(false);
                button2B.setSelected(false);
                button2C.setSelected(false);
                button2D.setSelected(false);
                
            }
            
             button1A.setIcon(airline.red); //Change icon to red
             button1B.setIcon(airline.red);
             button1C.setIcon(airline.red);
             button1D.setIcon(airline.red);
             button2A.setIcon(airline.red);
             button2B.setIcon(airline.red);
             button2C.setIcon(airline.red);
             button2D.setIcon(airline.red);
             
             
        
        
        firstName = firstNameTextField.getText(); //read string input from user and assign to variable
        lastName = lastNameTextField.getText(); //read string input from user and assign to variable
        
        customer = new Customer(firstName, lastName); //initialize customer object
        
        //creates new AirlineReceipt object
        AirlineReciept receipt = new AirlineReciept(customer.getFirstName(), customer.getLastName(), seat);
        receipt.setVisible(true); //displays pop-up JFrame 
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void button1CActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1CActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1CActionPerformed

    private void button1DActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_button1DActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_button1DActionPerformed

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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton acceptButton;
    private javax.swing.JLabel acceptLabel;
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
    private javax.swing.JLabel enterFirstNameLabel;
    private javax.swing.JLabel enterLastNameLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JLabel selectSeatLabel;
    // End of variables declaration//GEN-END:variables

    private void setUpButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
