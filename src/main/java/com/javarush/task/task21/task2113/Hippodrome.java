package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;
    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return horses;
    }

    public void run() {
        for (int i = 1; i <= 100; i++) {
            this.move();
            this.print();
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void move() {
        if (horses != null) {
            for (Horse horse : horses) {
                horse.move();
            }
        }
    }

    public void print() {
        if (horses != null) {
            for (Horse horse : horses) {
                horse.print();
            }
            for (int i = 0; i < 10; i++)
                System.out.println();
        }
    }

    public Horse getWinner() {
        Horse winnerHorse = horses.get(0);
        for (Horse horse : horses) {
            if (horse.getDistance() > winnerHorse.getDistance())
                winnerHorse = horse;
        }
        return winnerHorse;
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }

    public static void main(String[] args) {
        List<Horse> horses1 = new ArrayList<>();
        horses1.add(new Horse("horse1", 3, 0));
        horses1.add(new Horse("horse2", 3, 0));
        horses1.add(new Horse("horse3", 3, 0));
        game = new Hippodrome(horses1);
        game.run();
        game.printWinner();
    }
}
