package com.martin.furiouscars.methods;

public class OutOfMoneyException extends Exception{
    public OutOfMoneyException(String errorMessage){
        super(errorMessage);
    }
}
