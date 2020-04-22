package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    private static int counter;



    public static void main(String[] args) {
        Menu.intro ();
        Menu.gameStart ();
        startSentence ();
        game ();

    }



    public static void startSentence(){
        System.out.println ("type in the password: " + "(hint)" + Scrambler.scrambledWord ());
    }

    public static void game() {
        String userInput = scanner.nextLine ( );
        while (counter <= 3) {


            if ( !userInput.equals ( Scrambler.randomPassword () ) ) {
                counter++;
                System.out.println ( "Incorrect Password! " );

                if ( counter == 3 ) {
                    System.out.println ( "Too many failed attempts! Start over!" );
//                    Menu.gameStart ( );

                }

            } else {
                System.out.println ( "Correct!" );
            }
        }
    }

}
