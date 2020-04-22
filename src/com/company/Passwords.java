package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Passwords {
    private ArrayList<String> neighbourPasswords = new ArrayList<String>(Arrays.asList("neighbour","cluj", "duck", "stay","home", "blonde" ));
    private ArrayList<String> anafPasswords = new ArrayList<String>(Arrays.asList("file","map", "stapler", "bribe","home", "blonde" ));
    private  ArrayList<String> cnassPasswords = new ArrayList<String>(Arrays.asList("covid","health", "hospital", "sneeze","doctor", "disease" ));
    private ArrayList<String> passwords;


    public Passwords(int type){
        if (type == 3){
            passwords= neighbourPasswords;
        } else if (type==2){
            passwords=cnassPasswords;
        } else if (type==1){
            passwords=anafPasswords;
        }
    }

    public ArrayList<String> getPasswords() {
        return passwords;
    }







}
