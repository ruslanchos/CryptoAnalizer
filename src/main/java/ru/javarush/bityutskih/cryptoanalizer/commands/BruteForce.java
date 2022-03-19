package ru.javarush.bityutskih.cryptoanalizer.commands;

import ru.javarush.bityutskih.cryptoanalizer.entity.Result;
import ru.javarush.bityutskih.cryptoanalizer.entity.ResultCode;

public class BruteForce implements Action{
    @Override
    public Result execute(String[] parameters) {
        //TODO BruteForce выполнился
        return new Result( "BruteForce successful", ResultCode.OK);
    }
}
