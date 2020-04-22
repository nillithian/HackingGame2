package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);




    public static void main(String[] args) {
        Menu.intro ();
        Menu.gameMenu ();
        ArrayList<String> passwords = gameStart ();
        String password = Scrambler.randomPassword ( passwords );
        String scrambledPass = Scrambler.scrambledWord ( password );
        startSentence (scrambledPass);
        game (password);

    }



    public static void startSentence(String scrambledPassword){
        System.out.println ("Type in the password: " + "(hint: " + scrambledPassword + " )");
    }

    public static void game(String password) {

        int counter=0;

        while (counter < 3) {
            String userInput = scanner.nextLine ( );

            if ( !userInput.equals ( password ) ) {
                counter++;
                System.out.println ( "Incorrect Password! " );

                if ( counter == 3 ) {
                    System.out.println ( "Too many failed attempts! Start over!" );
                }

            } else {
                System.out.println ( "Correct!" );
                counter=3;
            }

        }
    }

    public static ArrayList<String> gameStart() {


        do  {

            int option = Menu.getOption ();
            if ( option == 4 ) {
                System.out.println ( "Exiting. " );
                break;
            } else if (option > 4){
                System.out.println ("Incorrect selection. Type a Number from 1 to 4 to select a Menu Option. " );
            } else {
                Passwords passwords = new Passwords ( option );
                return passwords.getPasswords ( );
            }

        }
        while (true) ;
        return null;
    }

}

