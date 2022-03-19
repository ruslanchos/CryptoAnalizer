package ru.javarush.bityutskih.cryptoanalizer.controllers;

import ru.javarush.bityutskih.cryptoanalizer.commands.Action;
import ru.javarush.bityutskih.cryptoanalizer.commands.Decoder;
import ru.javarush.bityutskih.cryptoanalizer.commands.Encoder;
import ru.javarush.bityutskih.cryptoanalizer.exceptions.AppException;

import java.util.Locale;

public enum Actions {
    ENCODE(new Encoder()),
    DECODE(new Decoder());

    private final Action action;
    Actions(Action action) {
        this.action=action;
    }

    public static Action find(String actionName){
       try {
           Actions value = Actions.valueOf(actionName.toUpperCase());
           return value.action;
       } catch (IllegalArgumentException e){
           throw new AppException();
       }
    }
}

