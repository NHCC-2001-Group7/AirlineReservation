/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airlineReservation;


/**
 * This class allows a customer to enter their name and have it be added to the receipt.
 * @author Mike Plucker, Billy Lam, Xavier Porter
 * Class: CSCI 2001-51
 * Due Date: 03/31/14
 * 
 * Version: Final
 */


public class Customer {
    
    //declare instance variables
    private String firstName, lastName;
    

    /**
     * Create constructor and initialize variables
     * @param firstName
     * @param lastName
     */
        public Customer (String firstName, String lastName){
        
        //initialize variables
	this.firstName = firstName;
	this.lastName = lastName;
    }

    /**
     * method to retrieve first name
     * @return firstName
     */
        public String getFirstName() {
        return firstName;
    }
    

    /**
     * method to set first name
     * @param firstName
     */
        public void setFirstName(String firstName) {
	this.firstName = firstName;
    }
    

    /**
     * method to retrieve last name
     * @return lastName
     */
        public String getLastName() {
        return lastName;
    }
    

    /**
     * method to set last name
     * @param lastName
     */
        public void setLastName(String lastName) {
	this.lastName = lastName;
    }
}
