package ru.javarush.bityutskih.cryptoanalizer.commands;

import ru.javarush.bityutskih.cryptoanalizer.entity.Result;
import ru.javarush.bityutskih.cryptoanalizer.entity.ResultCode;

public class Encoder implements Action{
    @Override
    public Result execute(String[] parameters) {
        //ENCODER выполнился
        return new Result( "Encode successful", ResultCode.OK);
    }
}
