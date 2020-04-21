package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class NeighborWifi {
    static Scanner scanner = new Scanner(System.in);
    public static int counter=0;

    public static void wifiStartGame(){
        startSentence ();
        game ();
    }

    public static void test(){
        System.out.println ( "Ai selectat reteaua vecinului");
    }
    public static void startSentence(){
        System.out.println ("type in the password: " + "(hint)" + Scrambler.scrambledWord ());
    }

    public static String wifiPasswords(){

        ArrayList<String> passwords = new ArrayList<> (  );
        passwords.add ( "neighbour" );
        passwords.add ( "cluj");
        passwords.add ( "duck" );
        passwords.add ( "stay" );
        passwords.add ( "home" );
        passwords.add ( "blonde" );

        Random rand = new Random();
        String randomElement = passwords.get(rand.nextInt(passwords.size()));
        return randomElement;
    }

    public static void game(){
        String userInput = scanner.nextLine ();
        if(!userInput.equals ( wifiPasswords () ) ){
            counter++;
            System.out.println ("Incorrect Password! " );

            if (counter==3){
                System.out.println ("Too many failed attempts! Start over!" );
                Menu.gameStart ();
            }
            game ();
        }
    }
}
