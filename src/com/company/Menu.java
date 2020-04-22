package com.company;
//Clasa meniu trebuie doar sa iti zica ce ai ales si sa iti faca return la acel element.


import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);

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

