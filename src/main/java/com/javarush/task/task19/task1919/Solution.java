package com.javarush.task.task19.task1919;

/*
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.TreeMap;

public class Solution {
    public static void main(String[] args) throws IOException {
        Map<String, Double> maps = new TreeMap<>();

        if (args.length == 0)
            throw new RuntimeException("args[0] не задан");
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] str = reader.readLine().split(" ");
                if (maps.containsKey(str[0]))
                    maps.put(str[0], maps.get(str[0]) + Double.parseDouble(str[1]));
                else
                    maps.put(str[0], Double.parseDouble(str[1]));
            }
        }

        maps.entrySet().stream().forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));
    }
}