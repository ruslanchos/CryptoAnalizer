package ru.javarush.bityutskih.cryptoanalizer.controllers;

import ru.javarush.bityutskih.cryptoanalizer.commands.Action;
import ru.javarush.bityutskih.cryptoanalizer.entity.Result;

public class MainController {

    public Result doAction(String actionName, String[] parameters) {
        //В action лежит encode (action == encode)
        Action action = Actions.find(actionName);
        return action.execute(parameters);
        //Result result = action.execute(parameters);
        //return result;
    }
}
