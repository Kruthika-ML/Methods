package com.company;

public class Methods {
    public static void main(String[] args){
        Calculate(true,800,5,100);
        Calculate(true,600,7,10);
    }

    public static void Calculate(boolean gameOver, int Score, int LevelCompleted, int Bonus){
        int FinalScore = Score + (LevelCompleted * Bonus);
        System.out.println("The Final Score is: " +FinalScore);
    }
}
