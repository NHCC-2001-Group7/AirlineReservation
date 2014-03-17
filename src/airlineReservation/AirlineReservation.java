/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airlineReservation;

/**
 *
 * @author: Mike Plucker, Billy Lam, Xavier Porter
 * Class: CSCI 2001-51
 * Due Date: 03/31/14
 * 
 * Version 1.00
 * Objective: A small airline has just purchased a computer for its new automated reservations system. 
 * You’ve been asked to develop the new system.You’re to write an application to assign seats on each flight of the airline’s only plane (capacity: 10 seats).
 * 
 * Requirements: 
 * -Please type 1 for First Class and Please type 2 for Economy. If the user types 1, your application should assign a seat in the first class 
 *  section (seats 1–5). If the user types 2, your application should assign a seat in the economy section (seats 6–10).
 *      -Your application should then display a boarding pass indicating the person’s seat number and whether it’s in the first-class or economy section of the plane.
 * -Use a one-dimensional array of primitive type boolean to represent the seating chart of the plane.
 *  -Initialize all the elements of the array to false to indicate that all the seats are empty.
 *      -As each seat is assigned, set the corresponding element of the array to true to indicate that the seat is no longer available.
 *          - Your application should never assign a seat that has already been assigned.
 * -When the economy section is full, your application should ask the person if it’s acceptable to be placed in the first-class section (and vice versa).
 *    - If yes, make the appropriate seat assignment. If no, display the message "Next flight leaves in 3 hours."
 * 
 */


//import classes
import java.util.Random;
import java.io.*;
import javax.sound.sampled.*;


public class AirlineReservation {
    

    /**
     *Creates a boolean array, seats containing 10 elements.
     */
    private boolean[] seats = new boolean [10];//create a boolean array, default value is false

    /**
     * Creates a boolean for the firstClass.
     */
    private boolean firstClass;

    /**
     * Creates a boolean for the economyClass.
     */
    private boolean economyClass;

    /**
     * Creates an object random.
     */
    private final Random rand = new Random();



    /**
     * Creates a constructor
     */
    public AirlineReservation (){

}


    /**
     * Method to retrieve first class
     * @return
     */
    public boolean getfirstClass(){
    return firstClass;
}


    /**
     *
     * @param firstClass 
     */
    public void setFirstclass(boolean firstClass){  
    this.firstClass = firstClass;
}


    /**
     *
     * @param firstClass Calculates the seating arrangement for the first Class
     * @return
     */
    public boolean[] firstSeatOrder(boolean firstClass){

         this.firstClass = firstClass;
         
         seats[(int)(Math.random()*5)] = true; //Selects a random value, 1-5 to true.
        
         boolean[] firstSeat = seats; //reference array

         return firstSeat; //return array
}
        

    /**
     * Method to retrieve the economy class
     * @return
     */
    public boolean geteconomyClass(){
    return economyClass;
}

    
    /**
     *
     * @param economyClass Set method for the economyClass
     */
    public void setEconomyclass(boolean economyClass){  
    this.economyClass = economyClass;
}


    /**
     *
     * @param economyClass Calculates the class seating for the economy class.
     * @return economySeat
     */
    public boolean[] economySeatOrder(boolean economyClass){

         this.economyClass = economyClass;
        
         seats[6+ (int)(Math.random()*(10 - 6))] = true; //Changes a random value 6-10 to true.

         boolean[] economySeat = seats; //reference array

         return economySeat; //return array
}
     /**
     *
     * @param optionalSeating If seating is full for first class, provide additional seating in economy class(vice-versa)
     * @return economySeat
     */
    public boolean optionalSeating(boolean[] economySeat, boolean[] firstSeat){
       
        boolean seatFull = true;
        boolean option = false;
        for(int i =0; i < seats.length; i++){ //loop through array
            
            if(economySeat[i]== seatFull){ //Not quite to sure about this
                
                seats[(int)(Math.random()*5)] = true; //Selects a random value, 1-5 to true.
                option = seats[(int)(Math.random()*5)];
            }
            if (firstSeat[i] == true){ //This one as well
                
                seats[6+ (int)(Math.random()*(10 - 6))] = true; //Changes a random value 6-10 to true.
                 option = seats[6+ (int)(Math.random()*(10 - 6))];
            }
        }
          return option;
        
 }

    /**
     *
     * @param soundFile method that creates the soundClip and plays the soundFile
     */
        public void soundClip(File soundFile){
        
        try{
            AudioInputStream audio = AudioSystem.getAudioInputStream(soundFile); //open an audio input stream
            Clip clip = AudioSystem.getClip(); //get a sound clip resource
            clip.open(audio); //open audio clip and load samples from the audio input stream
            clip.start(); //plays sound clip
        }catch(  UnsupportedAudioFileException | IOException | LineUnavailableException uae){
            System.out.println(uae);
        }  
    }

       
}



