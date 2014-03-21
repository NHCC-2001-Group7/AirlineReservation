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
 * 
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
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.ImageIcon;


public class AirlineReservation {
    
    //declare constants
    private final int FIRST_CLASS_SEATS = 7;
    private final int ECONOMY_CLASS_SEATS = 17;
    
    
    private boolean[] isTaken_FC = new boolean [FIRST_CLASS_SEATS]; //create first class array
    private boolean[] isTaken_EC = new boolean [ECONOMY_CLASS_SEATS]; //create economy class array
    //private ImageIcon[] seatImages = new ImageIcon[2];
    
    
    //create image files
    ImageIcon red = new ImageIcon(getClass().getResource("images/red.png"));
    ImageIcon green = new ImageIcon(getClass().getResource("images/green.png"));
    ImageIcon white = new ImageIcon(getClass().getResource("images/white.png"));
    
    ImageIcon[] seatImages = {red, green, white}; //create seatImages array
    
    
    /**
     * Creates a constructor
     */
    public AirlineReservation (){

    }

    
    public void selectFirstClass(int num){
        
        
        isTaken_FC[num] = true;
    }
    
    public void selectEconomyClass(int num){
        
        isTaken_EC[num] = true;
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



