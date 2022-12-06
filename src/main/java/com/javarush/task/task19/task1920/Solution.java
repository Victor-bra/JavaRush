package com.javarush.task.task19.task1920;

/*
Самый богатый
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args[0].length() == 0)
            throw new RuntimeException();

        Map<String, Double> maps = new TreeMap<>();
        Set<String> names = new TreeSet<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            while (reader.ready()) {
                String[] str = reader.readLine().split(" ");
                if (maps.containsKey(str[0]))
                    maps.put(str[0], maps.get(str[0]) + Double.parseDouble(str[1]));
                else
                    maps.put(str[0], Double.parseDouble(str[1]));
            }
        }
        double max = Integer.MIN_VALUE;
        for (Map.Entry<String, Double> maxValueMaps : maps.entrySet()) {
            if (maxValueMaps.getValue() > max)
                max = maxValueMaps.getValue();
        }
        for (Map.Entry<String, Double> maxValueMaps : maps.entrySet()) {
            if (maxValueMaps.getValue() == max)
                names.add(maxValueMaps.getKey());
        }
        //maps.entrySet().stream().forEach(System.out::println);
        names.stream().forEach(System.out::println);
    }
}