package com.javarush.task.task18.task1821;

/*
Встречаемость символов
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<Integer, Integer> characterIntegerMap = new HashMap<>();
        Map<Character, Integer> characterIntegerSortedASCIIMap = new LinkedHashMap<>();
        try (FileInputStream inputStream = new FileInputStream(args[0])) {
            while (inputStream.available() > 0) {
                int charsASCII = inputStream.read();
                if (!characterIntegerMap.containsKey(charsASCII))
                    characterIntegerMap.put(charsASCII, 1);
                else
                    characterIntegerMap.put(charsASCII, characterIntegerMap.get(charsASCII) + 1);
            }
        }
        //characterIntegerMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
        characterIntegerMap.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(a -> characterIntegerSortedASCIIMap.put((char) Integer.parseInt(a.getKey().toString()), a.getValue()));
        characterIntegerSortedASCIIMap.entrySet().stream().forEach(a -> System.out.println(a.getKey() + " " + a.getValue()));
    }

    /*public static void main(String[] args) throws IOException {
        int[] aSCII = new int[128];
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                aSCII[reader.read()]++;
            }
        }
        for (int i = 0; i < aSCII.length; i++) {
            if (aSCII[i] != 0) {
                System.out.println((char) i + " " + aSCII[i]);
            }
        }
    }*/
}
