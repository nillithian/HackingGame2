package com.company;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Scrambler {

public static String scrambledWord(){
//    String g = Anaf.anafPasswords ();

    char[] chars= g.toCharArray ();
    Random rgen = new Random();  // Random number generator

    for (int i=0; i<chars.length; i++) {
        int randomPosition = rgen.nextInt(chars.length);
        int temp = chars[i];
        chars[i] = chars[randomPosition];
        chars[randomPosition] = (char) temp;
    }

    return String.valueOf ( chars );
}
}
