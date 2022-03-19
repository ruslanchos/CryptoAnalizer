package ru.javarush.bityutskih.cryptoanalizer;

import ru.javarush.bityutskih.cryptoanalizer.controllers.MainController;
import ru.javarush.bityutskih.cryptoanalizer.entity.Result;
import ru.javarush.bityutskih.exceptions.AppException;

import java.util.Arrays;

public class Application {
    private final MainController mainController;

    public Application() {
        mainController = new MainController();

    }

    public Result run(String[] args) {
        //Пришли данные аргументов из ConsoleRunner
        if (args.length > 0) {
            String action = args[0]; //encode
            //параметры: text.txt encode.txt  key
            String[] parameters = Arrays.copyOfRange(args, 1, args.length);

            Result result = mainController.doAction(action, parameters);
        }
        throw new AppException();
    }

}
