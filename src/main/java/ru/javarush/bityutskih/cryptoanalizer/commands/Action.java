package ru.javarush.bityutskih.cryptoanalizer.commands;

import ru.javarush.bityutskih.cryptoanalizer.entity.Result;

public interface Action {

    Result execute(String[] parameters);
}
