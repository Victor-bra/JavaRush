package com.javarush.task.task37.task3712;

public class Tennis extends Game {
    @Override
    public void prepareForTheGame() {
        System.out.println("Preparing for the Tennis game...");
    }

    @Override
    public void playGame() {
        System.out.println("Playing tennis!");
    }

    @Override
    public void congratulateWinner() {
        System.out.println("Rafael Nadal wins once again!!!");
    }
}