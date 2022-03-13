package ru.javarush.bityutskih.cryptoanalizer;

import ru.javarush.bityutskih.cryptoanalizer.entity.Result;

public class ConsoleRunner {
    public static void main(String[] args) {
        final Application application = new Application();
        Result result = application.run(args);
        System.out.println(result);
    }
}
//        String rus="РЛРЛОРЛОРЛРЛОРЛОР";  -- to Constants
//        String eng="WDEWFDSFWEFEWFEWEWEF";
//        String cypher="0987654321";
//        String z="!@#$%^&";
//       // String z="!@#$%^&";
//        String alphabet=rus+eng+rus.toLowerCase()+eng.toLowerCase()+cypher+z;
//int key=123;  //args
//String text="Привет ЦЕЗАРЬ";
//String result="......";  //args
//System.out.println(Arrays.toString(args));