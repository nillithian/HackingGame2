package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cnass {
    static Scanner scanner = new Scanner(System.in);
    public static int counter=0;


    public static void cnassStartGame(){
        startSentence ();
        game ();
    }

    public static void test(){
        System.out.println ( "Ai selectat CNASS");
    }

    public static void startSentence(){
        System.out.println ("type in the password: " + "(hint)" + Scrambler.scrambledWord ());
    }

    public static String cnassPasswords(){

        ArrayList<String> passwords = new ArrayList<> (  );
        passwords.add ( "health" );
        passwords.add ( "disease");
        passwords.add ( "blood" );
        passwords.add ( "covid" );
        passwords.add ( "sneeze" );
        passwords.add ( "medic" );

        Random rand = new Random();
        String randomElement = passwords.get(rand.nextInt(passwords.size()));
        return randomElement;
    }

    public static void game(){
        String userInput = scanner.nextLine ();
        if(!userInput.equals ( cnassPasswords () ) ){
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
