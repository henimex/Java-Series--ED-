package com.hendev.PolyMorphismDemo;

public class Main {
    public static void main(String[] args){

        System.out.println("New Demo Test");

        EmailLogger emailLogger = new EmailLogger();
        emailLogger.Log("e-Mail Send");

        BaseLogger[] loggers = new BaseLogger[]{new DBLogger(), new FileLogger(), new EmailLogger() };

        for (BaseLogger logger:loggers) {
            logger.Log("Completed");
        }
    }
}
