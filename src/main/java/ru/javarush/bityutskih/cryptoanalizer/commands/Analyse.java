package ru.javarush.bityutskih.cryptoanalizer.commands;

import ru.javarush.bityutskih.cryptoanalizer.entity.Result;
import ru.javarush.bityutskih.cryptoanalizer.entity.ResultCode;

public class Analyse implements Action{
    @Override
    public Result execute(String[] parameters) {
        //TODO Analyze выполнился
        return new Result( "Analyze successful", ResultCode.OK);
    }
}
