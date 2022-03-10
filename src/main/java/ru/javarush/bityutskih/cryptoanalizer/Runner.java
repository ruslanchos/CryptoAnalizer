package ru.javarush.bityutskih.cryptoanalizer;

import java.util.Arrays;
import java.util.Locale;

public class Runner {
    public static void main(String[] args) {

        String rus="РЛРЛОРЛОРЛРЛОРЛОР";
        String eng="WDEWFDSFWEFEWFEWEWEF";
        String cyper="0987654321";
        String z="!@#$%^&";
       // String z="!@#$%^&";
        String alphabet=rus+eng+rus.toLowerCase();
        int key=123;  //args
        String text="Привет медвед";
        String result="......";  //args
        //System.out.println(Arrays.toString(args));
        final Application application = new Application(args);
    }
}
