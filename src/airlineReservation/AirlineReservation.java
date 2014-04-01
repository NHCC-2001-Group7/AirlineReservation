/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package airlineReservation;


//import classes
import java.io.*;
import javax.sound.sampled.*;
import javax.swing.ImageIcon;
import java.net.URL;


/**
 * This class maintains the elements of the AirlineReservation project
 * @author Mike Plucker, Billy Lam, Xavier Porter
 * Class: CSCI 2001-51
 * Due Date: 03/31/14
 * 
 * Version: Final
 */


public class AirlineReservation {
    
    
    //create image files
    private final ImageIcon RED = new ImageIcon(getClass().getResource("images/red.png"));
    private final ImageIcon GREEN = new ImageIcon(getClass().getResource("images/green.png"));
    private final ImageIcon WHITE = new ImageIcon(getClass().getResource("images/white.png"));
    
    //create seatImages array
    final ImageIcon[] SEAT_IMAGES = {RED, GREEN, WHITE};
    
    
    //create sound files
    private final URL JETPLANE = this.getClass().getResource("sounds/John Denver - Leaving on a Jetplane.wav");
    private final URL DING = this.getClass().getResource("sounds/Ding1.wav");
    private final URL AIRPLANE = this.getClass().getResource("sounds/Airplane.wav");
    
    //create soundClip array
    final URL[] SOUND = {JETPLANE, DING, AIRPLANE};
    
    
    //create seatNumbers array
    final String[] SEAT_NUMBERS = new String[] {"1A ", "1B ", "1C ", "1D ", "2A ", "2B ", "2C ", "2D ", "3A ", "3B ", "3C ", "3D ", "3E ", "3F ",
        "4A ", "4B ", "4C ", "4D ", "4E ", "4F ", "5A ", "5B ", "5C ", "5D ", "5E ", "5F "};
    
    
    /**
     * Creates a constructor
     */
    public AirlineReservation (){

    }
    
    
    /**
     *  Method to play (@link soundClip) for Airline Reservation
     * @param soundFile
     */
        public void soundClip(URL soundFile){
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



