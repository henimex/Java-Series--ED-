package com.hendev.PolyMorphismDemo;

public class DBLogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Logged to DB " + message);
    }
}
