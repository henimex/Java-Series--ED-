package com.hendev;

public abstract class GameCalculator {
    public void Calc(){
        System.out.println("Point is : 100");
    }

    public final void GameOver(){
        System.out.println("Game Over");
    }

    public abstract void CalcNew();
}
