package com.martin.furiouscars.methods;

public class CarNotFoundException extends Exception{
    public CarNotFoundException(String errorMessage,Throwable error){
        super(errorMessage, error);
    }
}
