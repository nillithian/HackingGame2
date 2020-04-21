package com.company;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Anaf {

    static Scanner scanner = new Scanner(System.in);
    public static int counter=0;

    public static void anafGame(){

            startSentence ();
            anafPasswords ();
            game ();

    }

    public static void test(){
        System.out.println ( "Ai selectat anaf");
        System.out.println (Anaf.anafPasswords () );
    }

    public static void startSentence(){
        System.out.println ("type in the password: " + "(hint)" + Scrambler.scrambledWord ());
    }

    public static String anafPasswords(){

        ArrayList<String> passwords = new ArrayList<> (  );
        passwords.add ( "panda" );
        passwords.add ( "koala");
        passwords.add ( "cacadu" );
        passwords.add ( "rat" );
        passwords.add ( "snake" );
        passwords.add ( "cockroach" );

        Random rand = new Random();
        String randomElement = passwords.get(rand.nextInt(passwords.size()));
        return randomElement;
}

    public static void game(){
        String userInput = scanner.nextLine ();
        if(!userInput.equals ( anafPasswords () ) ){
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
