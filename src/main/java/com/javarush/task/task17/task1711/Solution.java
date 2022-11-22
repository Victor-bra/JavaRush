package com.javarush.task.task17.task1711;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {
        //start here - начни тут
        if (args == null || args.length < 1)
            throw new RuntimeException();
        Date birthday;
        Person person;

        switch (args[0]) {
            case "-c":
                synchronized (allPeople) {
                    if ((args.length - 1) % 3 != 0)
                        throw new RuntimeException();
                    for (int i = 1; i < args.length; i += 3) {
                        if (args[i] == null || args[i + 1] == null || args[i + 2] == null)
                            throw new RuntimeException();
                        birthday = simpleDateFormat1.parse(args[i + 2]);
                        if (args[i + 1].equals("м"))
                            person = Person.createMale(args[i], birthday);
                        else
                            person = Person.createFemale(args[i], birthday);
                        allPeople.add(person);
                        System.out.println(allPeople.size() - 1);
                    }
                }
                break;
            case "-u":
                synchronized (allPeople) {
                    if ((args.length - 1) % 4 != 0)
                        throw new RuntimeException();
                    for (int i = 1; i < args.length; i += 4) {
                        if (args[i] == null || args[i + 1] == null || args[i + 2] == null || args[i + 3] == null)
                            throw new RuntimeException();
                        person = allPeople.get(Integer.parseInt(args[i]));
                        if (person == null)
                            throw new IllegalArgumentException();
                        person.setName(args[i + 1]);
                        person.setSex(args[i + 2].equals("м") ? Sex.MALE : Sex.FEMALE);
                        birthday = simpleDateFormat1.parse(args[i + 3]);
                        person.setBirthDate(birthday);
                        allPeople.set(Integer.parseInt(args[i]), person);
                    }
                }
                break;
            case "-d":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        if (args[i] == null)
                            throw new RuntimeException();
                        person = allPeople.get(Integer.parseInt(args[i]));
                        if (person == null)
                            throw new IllegalArgumentException();
                        person.setName(null);
                        person.setSex(null);
                        person.setBirthDate(null);
                        allPeople.set(Integer.parseInt(args[i]), person);
                    }
                }
                break;
            case "-i":
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        if (args[i] == null || Integer.parseInt(args[i]) >= allPeople.size())
                            throw new RuntimeException();
                        person = allPeople.get(Integer.parseInt(args[i]));
                        if (person == null)
                            throw new IllegalArgumentException();
                        String birthdayDay = simpleDateFormat2.format(person.getBirthDate());
                        System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + birthdayDay);
                    }
                }
                break;
        }
    }
}