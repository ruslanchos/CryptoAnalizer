package ru.javarush.bityutskih.cryptoanalizer.constants;

public class Constants {
    private static final String rus = "РЛРЛОРЛОРЛРЛОРЛОР";
    private static final String eng = "WDEWFDSFWEFEWFEWEWEF";
    private static final String cypher = "0987654321";
    private static final String z = "!@#$%^&";


    public static final String ALPHABET = rus + eng + rus.toLowerCase() + eng.toLowerCase() + cypher + z;

}
