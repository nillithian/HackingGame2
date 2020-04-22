package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Scrambler {

    public static String scrambledWord(String password) {


    char[] chars= password.toCharArray ();
    Random rgen = new Random();  // Random number generator

    for (int i=0; i<chars.length; i++) {
        int randomPosition = rgen.nextInt(chars.length);
        int temp = chars[i];
        chars[i] = chars[randomPosition];
        chars[randomPosition] = (char) temp;
    }

    return String.valueOf ( chars );
}

public static String randomPassword(ArrayList<String> passwords){


    Random rand = new Random();
    String randomElement;
    randomElement = passwords.get(rand.nextInt(passwords.size()));

    return randomElement;
}
}
