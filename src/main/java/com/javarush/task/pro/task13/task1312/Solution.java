package com.javarush.task.pro.task13.task1312;

import java.util.HashMap;

/*
ArrayList vs HashMap
*/

public class Solution {

    public static void main(String[] args) {
        System.out.println(getProgrammingLanguages());
    }

    /*public static ArrayList<String> getProgrammingLanguages() {
        //напишите тут ваш код
        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Go");
        programmingLanguages.add("Javascript");
        programmingLanguages.add("Typescript");
        programmingLanguages.add("Python");
        programmingLanguages.add("PHP");
        programmingLanguages.add("C++");
        return programmingLanguages;
    }*/

    public static HashMap<Integer, String> getProgrammingLanguages() {
        //напишите тут ваш код
        HashMap<Integer, String> programmingLanguages = new HashMap<>(){{
            put(0,"Java");
            put(1,"Kotlin");
            put(2,"Go");
            put(3,"Javascript");
            put(4,"Typescript");
            put(5,"Python");
            put(6,"PHP");
            put(7,"C++");
        }};

        return programmingLanguages;
    }
}