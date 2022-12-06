package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
        /*words.add("А");
        words.add("Б");
        words.add("В");*/
    }

    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader fileReader = new BufferedReader(new FileReader(reader.readLine()))) {
            while (fileReader.ready()) {
                Map<String, Integer> maps = new HashMap<>();
                String str = fileReader.readLine();
                String[] arrayStr = str.split(" ");
                for (int i = 0; i < arrayStr.length; i++) {
                    if (!maps.containsKey(arrayStr[i]))
                        maps.put(arrayStr[i], 1);
                    else
                        maps.put(arrayStr[i], maps.get(arrayStr[i]) + 1);
                }
                int count = 0;

                for (Map.Entry<String, Integer> map : maps.entrySet()) {
                    for (String word : words) {
                        if (map.getKey().equals(word))
                            count += map.getValue();
                    }
                }

                if (count == 2)
                    System.out.println(str);
            }
        }
    }
}