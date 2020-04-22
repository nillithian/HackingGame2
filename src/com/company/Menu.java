package com.company;
//Clasa meniu trebuie doar sa iti zica ce ai ales si sa iti faca return la acel element.


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    private static String password;


    public static ArrayList<String> gameStart() {
    ArrayList<String> passwords;
    gameMenu ( );

    do  {

        int option = getOption ( );

        if ( option == 1 ) {

            passwords = Anaf.anafPasswords ();
            return passwords;
        } else if ( option == 2 ) {

            passwords = Cnass.cnassPasswords ();
            return passwords;
        } else if ( option == 3 ) {
            passwords = NeighborWifi.wifiPasswords ();
            return passwords;
        } else if ( option == 4 ) {
            System.out.println ( "Exiting. " );
            break;
        } else {
            System.out.println ("Incorrect selection. Type a Number from 1 to 4 to select a Menu Option. " );
            gameStart ();
        }
    }
    while (true) ;
    return null;
}

    public static void gameMenu() {
        System.out.println ("1. ANAF" );
        System.out.println ("2. CNASS" );
        System.out.println ("3. Your Neighbour's WIFI" );
        System.out.println ("4. Exit Game" );


    }

    public static void intro(){
        System.out.println ("Welcome to the Hacking game. " );
        System.out.println("What would you like to hack today? : ");

    }

    static int getOption() {
        int option = scanner.nextInt(); //
        scanner.nextLine();
        System.out.println();
        return option;
    }




}

