/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airlineReservation;

/**
 *
 * @author Mike Plucker, Billy Lam, Xavier Porter
 */


public class Customer {
    
    //declare instance variables
    private String firstName, lastName;
    
    
    //constructor with parameters
    public Customer (String firstName, String lastName){
        
        //initialize variables
	this.firstName = firstName;
	this.lastName = lastName;
    }
    
    //method to retrieve first name
    public String getFirstName() {
        return firstName;
    }
    
    //method to set first name
    public void setFirstName(String firstName) {
	this.firstName = firstName;
    }
    
    //method to retrieve last name
    public String getLastName() {
        return lastName;
    }
    
    //method to set last name
    public void setLastName(String lastName) {
	this.lastName = lastName;
    }
}
