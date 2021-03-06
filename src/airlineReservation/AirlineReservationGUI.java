
package airlineReservation;


//import classes
import javax.swing.JToggleButton;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;


/**
 * This class generates the main GUI for the program.
 * @author Mike Plucker, Billy Lam, Xavier Porter
 * Class: CSCI 2001-51
 * Due Date: 03/31/14
 * 
 * Version: Final
 */


public class AirlineReservationGUI extends javax.swing.JFrame {
    
    //create objects
    private AirlineReservation airline = new AirlineReservation();
    private StringBuilder savedSeats = new StringBuilder();
    private Customer customer; //declare customer object
    
    
    //declare field variables
    private String firstName, lastName, seat;
    private int i, seatCounter;
    
    //declare button array
    private JToggleButton[] buttons;
    
    
    //create documentListener to validate if text is entered in TextFields
    DocumentListener documentListener = new DocumentListener() {
        @Override
        public void removeUpdate(DocumentEvent e) {
            validateNames();
        }
        @Override
        public void insertUpdate(DocumentEvent e) {
            validateNames();
        }
        @Override
        public void changedUpdate(DocumentEvent e) {
            validateNames();
        }
    };
    
    
    /**
     * Creates new form AirlineReservationGUI
     */
    public AirlineReservationGUI() {
        initComponents();
        
        savedSeats.append("Seats: "); //adds initial string to StringBuilder
            
        buttonArray(); //method to initialize button array (add buttons to array)
        setupButtons(); //method to setup buttons
        
        airline.soundClip(airline.SOUND[0]); //play backgound music from Sound array
        
        acceptButton.setEnabled(false); //set acceptButton to disabled as default
        
        seatTextField.setEditable(false); //text in textField can't be edited
        
        //add documentListeners to each TextField to validate if user input text into TextFields
        firstNameTextField.getDocument().addDocumentListener(documentListener);
        lastNameTextField.getDocument().addDocumentListener(documentListener);
        seatTextField.getDocument().addDocumentListener(documentListener);
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
        seatTextField = new javax.swing.JTextField();
        info1Label = new javax.swing.JLabel();
        info2Label = new javax.swing.JLabel();
        acceptButton = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        firstClassLabel = new javax.swing.JLabel();
        economyClassLabel = new javax.swing.JLabel();
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

        button3A.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button3A.setLabel("3 A");
        button3A.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button3A.setMaximumSize(new java.awt.Dimension(19, 15));
        button3A.setMinimumSize(new java.awt.Dimension(19, 15));
        button3A.setPreferredSize(new java.awt.Dimension(19, 15));
        button3A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3A);
        button3A.setBounds(312, 321, 36, 36);

        button3B.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button3B.setText("3 B");
        button3B.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button3B.setMaximumSize(new java.awt.Dimension(19, 15));
        button3B.setMinimumSize(new java.awt.Dimension(19, 15));
        button3B.setPreferredSize(new java.awt.Dimension(19, 15));
        button3B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3B);
        button3B.setBounds(348, 320, 36, 38);

        button3C.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button3C.setText("3 C");
        button3C.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button3C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3C);
        button3C.setBounds(384, 320, 36, 38);

        button3D.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button3D.setText("3 D");
        button3D.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button3D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3D);
        button3D.setBounds(450, 320, 36, 36);

        button3E.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button3E.setText("3 E");
        button3E.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button3E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3E);
        button3E.setBounds(486, 320, 36, 36);

        button3F.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button3F.setText("3 F");
        button3F.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button3F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button3F);
        button3F.setBounds(522, 320, 36, 36);

        button4A.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button4A.setText("4 A");
        button4A.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button4A.setMaximumSize(new java.awt.Dimension(19, 15));
        button4A.setMinimumSize(new java.awt.Dimension(19, 15));
        button4A.setPreferredSize(new java.awt.Dimension(19, 15));
        button4A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4A);
        button4A.setBounds(312, 286, 36, 36);

        button4B.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button4B.setText("4 B");
        button4B.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button4B.setMaximumSize(new java.awt.Dimension(19, 15));
        button4B.setMinimumSize(new java.awt.Dimension(19, 15));
        button4B.setPreferredSize(new java.awt.Dimension(19, 15));
        button4B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4B);
        button4B.setBounds(348, 286, 36, 36);

        button4C.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button4C.setText("4 C");
        button4C.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button4C.setMaximumSize(new java.awt.Dimension(19, 15));
        button4C.setMinimumSize(new java.awt.Dimension(19, 15));
        button4C.setPreferredSize(new java.awt.Dimension(19, 15));
        button4C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4C);
        button4C.setBounds(384, 286, 36, 36);

        button4D.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button4D.setText("4 D");
        button4D.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button4D.setMaximumSize(new java.awt.Dimension(19, 15));
        button4D.setMinimumSize(new java.awt.Dimension(19, 15));
        button4D.setPreferredSize(new java.awt.Dimension(19, 15));
        button4D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4D);
        button4D.setBounds(450, 284, 36, 36);

        button4E.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button4E.setText("4 E");
        button4E.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button4E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4E);
        button4E.setBounds(486, 284, 36, 36);

        button4F.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button4F.setText("4 F");
        button4F.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button4F.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button4F);
        button4F.setBounds(522, 284, 36, 36);

        button5A.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button5A.setText("5 A");
        button5A.setBorderPainted(false);
        button5A.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        button5A.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button5A.setMaximumSize(new java.awt.Dimension(19, 15));
        button5A.setMinimumSize(new java.awt.Dimension(19, 15));
        button5A.setPreferredSize(new java.awt.Dimension(19, 15));
        button5A.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button5A);
        button5A.setBounds(312, 250, 36, 36);

        button5B.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button5B.setText("5 B");
        button5B.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button5B.setMaximumSize(new java.awt.Dimension(19, 15));
        button5B.setMinimumSize(new java.awt.Dimension(19, 15));
        button5B.setPreferredSize(new java.awt.Dimension(19, 15));
        button5B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button5B);
        button5B.setBounds(348, 250, 36, 36);

        button5C.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button5C.setText("5 C");
        button5C.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button5C.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button5C);
        button5C.setBounds(384, 250, 36, 36);

        button5D.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button5D.setText("5 D");
        button5D.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button5D.setMaximumSize(new java.awt.Dimension(19, 15));
        button5D.setMinimumSize(new java.awt.Dimension(19, 15));
        button5D.setPreferredSize(new java.awt.Dimension(19, 15));
        button5D.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button5D);
        button5D.setBounds(450, 250, 36, 36);

        button5E.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button5E.setText("5 E");
        button5E.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button5E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AirlineReservationGUI.this.actionPerformed(evt);
            }
        });
        getContentPane().add(button5E);
        button5E.setBounds(486, 250, 36, 36);

        button5F.setFont(new java.awt.Font("Tahoma", 0, 9)); // NOI18N
        button5F.setText("5 F");
        button5F.setMargin(new java.awt.Insets(-5, -5, -5, -5));
        button5F.setMaximumSize(new java.awt.Dimension(19, 15));
        button5F.setMinimumSize(new java.awt.Dimension(19, 15));
        button5F.setPreferredSize(new java.awt.Dimension(19, 15));
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
        lastNameTextField.setBounds(160, 142, 120, 30);

        seatTextField.setBackground(new java.awt.Color(180, 195, 234));
        seatTextField.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        seatTextField.setText("Seats: ");
        seatTextField.setBorder(null);
        getContentPane().add(seatTextField);
        seatTextField.setBounds(28, 176, 252, 32);

        info1Label.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        info1Label.setText("Please Enter Your Name and Choose a");
        getContentPane().add(info1Label);
        info1Label.setBounds(28, 200, 248, 34);

        info2Label.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        info2Label.setText("Seat on the Plane, then Hit Accept");
        getContentPane().add(info2Label);
        info2Label.setBounds(28, 222, 242, 28);

        acceptButton.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        acceptButton.setText("ACCEPT");
        acceptButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                acceptButtonActionPerformed(evt);
            }
        });
        getContentPane().add(acceptButton);
        acceptButton.setBounds(60, 252, 174, 52);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlineReservation/images/SeatingChart4.jpg"))); // NOI18N
        jTabbedPane1.addTab("Help", jLabel1);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlineReservation/images/About.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        jTabbedPane1.addTab("About", jLabel2);

        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(14, 334, 194, 210);

        firstClassLabel.setFont(new java.awt.Font("Serif", 1, 22)); // NOI18N
        firstClassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        firstClassLabel.setText("First Class");
        getContentPane().add(firstClassLabel);
        firstClassLabel.setBounds(316, 366, 236, 24);

        economyClassLabel.setFont(new java.awt.Font("Serif", 1, 16)); // NOI18N
        economyClassLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        economyClassLabel.setText("Economy Class");
        getContentPane().add(economyClassLabel);
        economyClassLabel.setBounds(350, 226, 170, 20);

        background.setBackground(new java.awt.Color(153, 255, 153));
        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/airlineReservation/images/Airline 6.jpg"))); // NOI18N
        getContentPane().add(background);
        background.setBounds(0, -50, 740, 720);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    
    /**
     * method that validates if a user entered names and selected seat before allowing acceptButton to be pressed
     */
    private void validateNames(){
        if(firstNameTextField.getText().equals("") || lastNameTextField.getText().equals("")){ //if no text in either textField
            acceptButton.setEnabled(false); //disable acceptButton
        }
        else if(seatCounter != 0){ //if the seatCounter does not equal 0 the accept button will be enabled
                acceptButton.setEnabled(true); //enable acceptButton
                info1Label.setText(" "); //removes text if customer has entered name and selected a seat
                info2Label.setText("Hit Accept"); //Makes "Hit Accept" text appear after a seat has been selected and name entered
        }
        if(seatTextField.getText().equals("Seats: ")){ //if the textField is the default text
                acceptButton.setEnabled(false); //disable acceptButton
        }    
    }
    
    /**
     * method to initialize button array
     */
    private void buttonArray(){
        
        //adds buttons to button array
        buttons = new JToggleButton[] {button1A, button1B, button1C, button1D, button2A, button2B, button2C, button2D, 
        button3A, button3B, button3C, button3D, button3E, button3F, button4A, button4B, button4C, button4D, button4E,
        button4F, button5A, button5B, button5C, button5D, button5E, button5F};
    }
    
    /**
     * method to setup buttons
     */
    private void setupButtons(){
        
        //enhanced for loop will act on all buttons
        for(JToggleButton element: buttons){
            element.setIcon(airline.SEAT_IMAGES[2]); //sets all button icons to white image
            element.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER); //sets text to center instead of trailing
        }
    }
    
    /**
     * method to remove seat number text from StringBuilder
     */
    private void removeSeat(){
        
        //remove seat from StringBuilder
        int j = savedSeats.indexOf(airline.SEAT_NUMBERS[i]); //finds the index that the seat's string first occurs
        if(j != -1){
            savedSeats.delete(j, j + airline.SEAT_NUMBERS[i].length()); //delete seat number from StringBuilder
        }
    }
    
    /**
     * method that converts StringBuilder toString and applies it
     */
    private void applyStringBuilder(){
        
        //sets label text
        seatTextField.setText(savedSeats.toString());
        
        //sets seat value
        seat = savedSeats.toString();
    }
    
    /**
     *  method that disables any selected buttons
     */
    private void disableSelectedButtons(){
        
        //enhanced for loop that disables buttons if they have been selected
        for(JToggleButton element: buttons){            
            if(element.isSelected()){ //if a button has been selected
                element.setDisabledIcon(airline.SEAT_IMAGES[0]); //sets disabled icon to red image
                element.setEnabled(false); //disable button
                element.setSelected(false); //sets button to  "unselected"
            }
        }
    }
  
    /**
     * method that reads input from user and creates new customer
     */
    private void createCustomer(){
        firstName = firstNameTextField.getText(); //read string input from user and assign to variable
        lastName = lastNameTextField.getText(); //read string input from user and assign to variable
        
        customer = new Customer(firstName, lastName); //initialize customer object 
    }

    /**
     * method that resets StringBuilder
     */
    private void resetStringBuilder(){
        
        //reset StringBuilder
        int k = savedSeats.length(); //finds the length of the StringBuilder
        savedSeats.replace(0, k, "Seats: "); //replaces any seats selected
        seat = savedSeats.toString(); //resets seat value
    }
   
    /**
     * method that resets TextFields, StringBuilder, seatCounter and labels
     */
    private void resetForNewCustomer(){
        
        //reset TextFields
        firstNameTextField.setText("");
        lastNameTextField.setText("");
        
        resetStringBuilder(); //call method to reset StringBuilder
        
        seatCounter = 0; //resets seatCounter so info1 label and info2 label don't change when only a name is entered second run of program
        
        seatTextField.setText("Seats: "); //resets label text
        info1Label.setText("Please Enter Your Name and Choose a"); //resets label text
        info2Label.setText("Seat on the Plane, then Hit Accept"); //resets label text
    }
    
    private void acceptButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_acceptButtonActionPerformed
        disableSelectedButtons(); //call method that will disable any selected buttons
        
        airline.soundClip(airline.SOUND[2]); //play sound clip
        
        createCustomer(); //call method to read input from user and create new customer
        
        //creates new AirlineReceipt object
        AirlineReciept receipt = new AirlineReciept(customer.getFirstName(), customer.getLastName(), seat);
        receipt.setVisible(true); //displays pop-up JFrame 
        
        resetForNewCustomer(); //method to reset TextFields, StringBuilder and selectSeatLabel       
    }//GEN-LAST:event_acceptButtonActionPerformed

    private void actionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actionPerformed
        airline.soundClip(airline.SOUND[1]); //play sound clip
        
        //for loop iterates through array to see if any buttons have been selected
        for(i = 0; i < buttons.length; i++){ 
            if(buttons[i].isSelected()){ //if user selects a button
                buttons[i].setIcon(airline.SEAT_IMAGES[1]); //change button's icon to green image
                              
                removeSeat(); //call method to remove seat number text from StringBuilder                
                
                savedSeats.append(airline.SEAT_NUMBERS[i]); //add seat to StringBuilder (get string from seatNumber array)                
                
                seatCounter++; //adds increment to the seatCounter variable
            }
            else{ //user deselects button
                buttons[i].setIcon(airline.SEAT_IMAGES[2]); //return button's icon to default white image
                
                removeSeat(); //call method to remove seat number text from StringBuilder
                
                seatCounter--; //removes increment to the seatCounter variable 
            }
        }  
        validateNames(); //call method that validates names and button selection
        applyStringBuilder(); //method sets StringBuilder to text and passes to a variable
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
    private javax.swing.JLabel economyClassLabel;
    private javax.swing.JLabel enterFirstNameLabel;
    private javax.swing.JLabel enterLastNameLabel;
    private javax.swing.JLabel firstClassLabel;
    private javax.swing.JTextField firstNameTextField;
    private javax.swing.JLabel info1Label;
    private javax.swing.JLabel info2Label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField lastNameTextField;
    private javax.swing.JTextField seatTextField;
    // End of variables declaration//GEN-END:variables

    private void setUpButton() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
