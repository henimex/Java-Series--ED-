package com.hendev.PolyMorphismDemo;

public class EmailLogger extends BaseLogger{
    public void Log(String message){
        System.out.println("Log Mail Send " + message);
    }
}
