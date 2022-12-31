package com.sugarglider.exceptionhandling.example;

public class CurrenciesDoNotMatchException extends Exception{
    public CurrenciesDoNotMatchException() {
    }

    public CurrenciesDoNotMatchException(String message) {
        super(message);
    }
}
