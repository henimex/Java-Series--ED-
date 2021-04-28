package com.hendev;

import com.hendev.PolyMorphismDemo.BaseLogger;

public class CustomerManager extends PersonManager {
    private BaseLogger _baseLogger;

    public CustomerManager(BaseLogger logger){
        this._baseLogger = logger;
    }

    public void  Add(){
        System.out.println("via CustomerManager Added");
        _baseLogger.Log("Customer Manager Logged");
    }

    public void  Delete(){
        System.out.println("via CustomerManager Deleted");
    }

    public void  Update(){
        System.out.println("Customer Updated");
    }
}

