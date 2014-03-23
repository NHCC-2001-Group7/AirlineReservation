
package airlineReservation;


/**
 * 
 * @author: Mike Plucker, Billy Lam, Xavier Porter
 * Class: CSCI 2001-51
 * Due Date: 03/31/14
 * 
 * Version: 1.00
 * 
 * 
 * This class generates the main GUI for the program.
 * 
 */


//import classes
import javax.swing.JToggleButton;
import java.io.*;

public class AirlineReservationGUI extends javax.swing.JFrame {
    
    //create objects
    private AirlineReservation airline = new AirlineReservation();
    private StringBuilder savedSeats = new StringBuilder();
    private Customer customer; //declare customer object
    
    
    //declare field variables
    private String firstName, lastName, seat;
    
    //declare button array
    private JToggleButton[] buttons;
    private String[] seatNumbers;
    
    
    //create sound files
    //private final File infinity = new File("infinity.wav");
    

    /**
     * Creates new form AirlineReservationGUI
     */
    public AirlineReservationGUI() {
        initComponents();
        savedSeats.append("Seats: "); //adds initial string to StringBuilder
            
        buttonArray(); //method to initialize button array (add buttons to array)
        setupButtons(); //method to setup buttons
        seatNumberArray(); //method to initialize seatNumber array (add seat numbers to array)
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

        button1A.setText("1 A");
        button1A.setToolTipText("");
        button1A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button1A);
        button1A.setBounds(316, 444, 48, 48);

        button1B.setText("1 B");
        button1B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button1B);
        button1B.setBounds(366, 444, 48, 48);

        button1C.setText("1 C");
        button1C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button1C);
        button1C.setBounds(458, 444, 48, 48);

        button1D.setText("1 D");
        button1D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button1D);
        button1D.setBounds(506, 444, 48, 48);

        button2A.setText("2 A");
        button2A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button2A);
        button2A.setBounds(316, 394, 48, 48);

        button2B.setText("2 B");
        button2B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button2B);
        button2B.setBounds(366, 394, 48, 48);

        button2C.setText("2 C");
        button2C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button2C);
        button2C.setBounds(458, 394, 48, 48);

        button2D.setText("2 D");
        button2D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button2D);
        button2D.setBounds(506, 394, 48, 48);

        button3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3A);
        button3A.setBounds(312, 321, 36, 36);

        button3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3B);
        button3B.setBounds(348, 320, 36, 38);

        button3C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3C);
        button3C.setBounds(384, 320, 36, 38);

        button3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3D);
        button3D.setBounds(450, 320, 36, 36);

        button3E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3E);
        button3E.setBounds(486, 320, 36, 36);

        button3F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3F);
        button3F.setBounds(522, 320, 36, 36);

        button4A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4A);
        button4A.setBounds(312, 286, 36, 36);

        button4B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4B);
        button4B.setBounds(348, 286, 36, 36);

        button4C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4C);
        button4C.setBounds(384, 286, 36, 36);

        button4D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4D);
        button4D.setBounds(450, 284, 36, 36);

        button4E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4E);
        button4E.setBounds(486, 284, 36, 36);

        button4F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4F);
        button4F.setBounds(522, 284, 36, 36);

        button5A.setBorderPainted(false);
        button5A.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button5A.setRolloverEnabled(false);
        button5A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button5A);
        button5A.setBounds(312, 250, 36, 36);

        button5B.setRolloverEnabled(false);
        button5B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button5B);
        button5B.setBounds(348, 250, 36, 36);

        button5C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button5C);
        button5C.setBounds(384, 250, 36, 36);

        button5D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button5D);
        button5D.setBounds(450, 250, 36, 36);

        button5E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button5E);
        button5E.setBounds(486, 250, 36, 36);

        button5F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
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
    
    //method to initialize button array
    private void buttonArray(){
        
        //adds buttons to button array
        buttons = new JToggleButton[] {button1A, button1B, button1C, button1D, button2A, button2B, button2C, button2D, 
        button3A, button3B, button3C, button3D, button3E, button3F, button4A, button4B, button4C, button4D, button4E,
        button4F, button5A, button5B, button5C, button5D, button5E, button5F};
    }
    
    //method to setup buttons
    private void setupButtons(){
        
        //enhanced for loop will act on all buttons
        for(JToggleButton element: buttons){
            element.setIcon(airline.SEAT_IMAGES[2]); //sets all button icons to white image
            element.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER); //sets text to center instead of trailing
            //element.
            //element.setRolloverIcon(null);
            //element.setFocusable(false);
            //element.setBorder(null);
        }
    }
    
    //method to initialize seatNumber array
    private void seatNumberArray(){
        
        //adds seat numbers to array
        seatNumbers = new String[] {"1A ", "1B ", "1C ", "1D ", "2A ", "2B ", "2C ", "2D ", "3A ", "3B ", "3C ", "3D ", "3E ", "3F ",
        "4A ", "4B ", "4C ", "4D ", "4E ", "4F ", "5A ", "5B ", "5C ", "5D ", "5E ", "5F "};
    }
    
//    //method that converts StringBuilder toString and applys it
//    private void applyStringBuilder(){
//        
//        //sets label text
//        selectSeatLabel.setText(savedSeats.toString());
//        
//        //sets seat value
//        seat = savedSeats.toString();
//    } 
    
    //this is just a backup for button1AActionPerformed...ignore for now
    private void ignoreMe(){
        
//        //declare local variable
//        String seatSelected = " 1B";
//        
//        //if user selects button
//        if(button1B.isSelected()){
//            button1B.setIcon(airline.SEAT_IMAGES[1]); //change icon to green image
//            savedSeats.append(seatSelected); //add seat to StringBuilder
//        }
//        else{ //user deselects button
//            button1B.setIcon(airline.SEAT_IMAGES[2]); //return icon to default white image
//            
//            //remove seat from StringBuilder
//            int i = savedSeats.indexOf(seatSelected); //finds the index that the seat's string first occurs
//            if(i != -1){
//                savedSeats.delete(i, i + seatSelected.length()); //delete seat from StringBuilder
//            }
//        }
//        
//        applyStringBuilder(); //method sets StringBuilder to text and passes to a variable
    }
    
    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        
        //enhanced for loop that disables buttons if they have been selected
        for(JToggleButton element: buttons){
            if(element.isSelected()){ //if a button has been selected
                element.setDisabledIcon(airline.SEAT_IMAGES[0]); //sets disabled icon to red image
                element.setEnabled(false); //disable button
            }
        }
        
        
        firstName = firstNameTextField.getText(); //read string input from user and assign to variable
        lastName = lastNameTextField.getText(); //read string input from user and assign to variable
        
        customer = new Customer(firstName, lastName); //initialize customer object
        
        //creates new AirlineReceipt object
        AirlineReciept receipt = new AirlineReciept(customer.getFirstName(), customer.getLastName(), seat);
        receipt.setVisible(true); //displays pop-up JFrame 
        
        
        //reset TextFields
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        
        //reset StringBuilder
        int i = savedSeats.length(); //finds the length of the StringBuilder
        savedSeats.replace(0, i, "Seats: "); //replaces any seats selected
        seat = savedSeats.toString(); //resets seat value
        
        selectSeatLabel.setText("Please Choose a Seat on the Plane"); //resets label text
        
        //airline.soundClip(infinity); //play sound clip
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionPerformed
        
        //for loop iterates through array to see if any buttons have been selected
        for(int i = 0; i < buttons.length; i++){
            if(buttons[i].isSelected()){ //if user selects a button
                buttons[i].setIcon(airline.SEAT_IMAGES[1]); //change button's icon to green image
                
                int j = savedSeats.indexOf(seatNumbers[i]); //finds the index that the seat's string first occurs
                if(j != -1){
                    savedSeats.delete(j, j + seatNumbers[i].length()); //Clears previous text so line 498 text doesn't build up
                }
                
                savedSeats.append(seatNumbers[i]); //add seat to StringBuilder (get string from seatNumber array)
            }
            else{ //user deselects button
                buttons[i].setIcon(airline.SEAT_IMAGES[2]); //return button's icon to default white image
                
                //remove seat from StringBuilder
                int j = savedSeats.indexOf(seatNumbers[i]); //finds the index that the seat's string first occurs
                if(j != -1){
                    savedSeats.delete(j, j + seatNumbers[i].length()); //delete seat from StringBuilder
                }
            }
            
            //applyStringBuilder(); //method sets StringBuilder to text and passes to a variable
        }
        
        //sets label text
        selectSeatLabel.setText(savedSeats.toString());
        
        //sets seat value
        seat = savedSeats.toString();
        
        //applyStringBuilder(); //method sets StringBuilder to text and passes to a variable
    }//GEN-LAST:event_actionPerformed

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
