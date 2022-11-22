package com.javarush.task.task17.task1710;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/*
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
    public static SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    public static void main(String[] args) throws ParseException {
        //напишите тут ваш код
        if (args == null || args.length < 1)
            throw new RuntimeException();
        Date birthday;
        Person person;

        switch (args[0]) {
            case "-c":
                if (args[1] == null || args[2] == null || args[3] == null)
                    throw new RuntimeException();
                birthday = simpleDateFormat1.parse(args[3]);
                if (args[2].equals("м"))
                    person = Person.createMale(args[1], birthday);
                else
                    person = Person.createFemale(args[1], birthday);
                allPeople.add(person);
                System.out.println(allPeople.size() - 1);
                break;
            case "-r":
                if (args[1] == null || Integer.parseInt(args[1]) >= allPeople.size())
                    throw new RuntimeException();
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person == null)
                    throw new IllegalArgumentException();
                String birthdayDay = simpleDateFormat2.format(person.getBirthDate());
                System.out.println(person.getName() + " " + (person.getSex() == Sex.MALE ? "м" : "ж") + " " + birthdayDay);
                break;
            case "-u":
                if (args[1] == null || args[2] == null || args[3] == null || args[4] == null)
                    throw new RuntimeException();
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person == null)
                    throw new IllegalArgumentException();
                person.setName(args[2]);
                person.setSex(args[3].equals("м") ? Sex.MALE : Sex.FEMALE);
                birthday = simpleDateFormat1.parse(args[4]);
                person.setBirthDate(birthday);
                allPeople.set(Integer.parseInt(args[1]), person);
                break;
            case "-d":
                if (args[1] == null)
                    throw new RuntimeException();
                person = allPeople.get(Integer.parseInt(args[1]));
                if (person == null)
                    throw new IllegalArgumentException();
                person.setName(null);
                person.setSex(null);
                person.setBirthDate(null);
                allPeople.set(Integer.parseInt(args[1]), person);
                break;
        }
    }
}