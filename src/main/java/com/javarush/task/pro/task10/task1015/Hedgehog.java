package com.javarush.task.pro.task10.task1015;

/*
Ежик и яблоко
*/

public class Hedgehog {

    public void eat(Apple apple) {
        System.out.println("Яблоко было съедено!");
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        new Hedgehog().eat(new Apple());
    }

    public static class Apple {
    }
}