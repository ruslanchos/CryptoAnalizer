package ru.javarush.bityutskih.cryptoanalizer.commands;

import ru.javarush.bityutskih.cryptoanalizer.entity.Result;
import ru.javarush.bityutskih.cryptoanalizer.entity.ResultCode;

public class Decoder implements Action{
    @Override
    public Result execute(String[] parameters) {
        //DECODER выполнился
        return new Result( "Decode successful", ResultCode.OK);
    }
}
