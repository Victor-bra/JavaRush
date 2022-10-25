package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/*
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key;

        //тут цикл по чтению ключей, пункт 1
        while (true) {
            key = reader.readLine();
            if (key.equalsIgnoreCase("user") || key.equalsIgnoreCase("loser") || key.equalsIgnoreCase("coder") || key.equalsIgnoreCase("proger")) {
                if (key.equalsIgnoreCase("user"))
                    person = new Person.User();
                else if (key.equalsIgnoreCase("loser"))
                    person = new Person.Loser();
                else if (key.equalsIgnoreCase("coder"))
                    person = new Person.Coder();
                else if (key.equalsIgnoreCase("proger"))
                    person = new Person.Proger();

                doWork(person);
            } else {
                break;
            }
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User)
            ((Person.User) person).live();
        else if (person instanceof Person.Loser)
            ((Person.Loser) person).doNothing();
        else if (person instanceof Person.Coder)
            ((Person.Coder) person).writeCode();
        else if (person instanceof Person.Proger)
            ((Person.Proger) person).enjoy();
    }
}