package com.javarush.task.task22.task2209;

/*
Составить цепочку слов
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        List<String> words = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader reader = new BufferedReader(new FileReader(bufferedReader.readLine()))) {
            while (reader.ready()) {
                Collections.addAll(words, reader.readLine().split(" "));
            }
        }
        //words.stream().forEach(System.out::println);
        StringBuilder result = getLine(words.toArray(new String[words.size()]));
        System.out.println(result.toString());
    }

    public static StringBuilder getLine(String... words) {
        if (words.length == 0)
            return new StringBuilder();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> str = new ArrayList<>();
        Arrays.stream(words).forEach(c -> str.add(c));
        List<String> strings = new LinkedList<>();

        for (int i = 0; i < str.size(); i++) {
            int count = 0;
            char[] chars1 = str.get(i).toLowerCase().toCharArray();
            for (int j = 0; j < str.size(); j++) {
                if (i == j)
                    continue;
                char[] chars2 = str.get(j).toLowerCase().toCharArray();
                if (chars1[chars1.length - 1] == chars2[0])
                    ++count;
            }
            if (count == 0) {
                strings.add(str.get(i));
                str.remove(i);
                break;
            }
        }

        if (strings.size() == 0) {
            strings.add(str.get(0));
            str.remove(0);
        }

        for (int i = 0; i < strings.size(); i++) {
            List<String> tempList = new ArrayList<>();
            char[] chars1 = strings.get(i).toLowerCase().toCharArray();
            for (int j = 0; j < str.size(); j++) {
                if (str.get(j) == null)
                    continue;
                char[] chars2 = str.get(j).toLowerCase().toCharArray();
                if (chars1[0] == chars2[chars2.length - 1]) {
                    tempList.add(str.get(j));
                    str.set(j, null);
                }
            }
            if(tempList.size()==0 && i==0){
                for(int x=0;x<strings.size();x++) {
                    char[] charsX = strings.get(x).toLowerCase().toCharArray();
                    for (int y = 0; y < str.size(); y++) {
                        if(str.get(y)==null)
                            continue;
                        char[] charsY = str.get(y).toLowerCase().toCharArray();
                        if(charsX[charsX.length-1] == charsY[0]){
                            strings.add(str.get(y));
                            str.set(y,null);
                        }
                    }
                }
                for (String s: strings) {
                    stringBuilder.append(s + " ");
                }
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);

                return stringBuilder;
            }
            if (tempList.size() == 1) {
                strings.add(tempList.get(0));
                tempList.remove(0);
            } else {
                int z = 0;
                for (int j = 0; j < tempList.size(); j++) {
                    char[] chars2 = tempList.get(j).toLowerCase().toCharArray();
                    if (chars1[0] == chars2[0]) {
                        strings.add(tempList.get(j));
                        tempList.set(j, null);
                        z++;
                    }
                }
                int x = 0, m = 0;
                for (String s : tempList) {
                    if (z == 0) {
                        if (x == 0) {
                            strings.add(s);
                            x++;
                        } else {
                            str.add(s);
                        }
                        if (m == 0) {
                            i--;
                        }
                        m++;
                    } else {
                        if (s != null)
                            strings.add(s);
                    }
                }
                i++;
            }

        }

        for (int i = strings.size() - 1; i >= 0; i--) {
            stringBuilder.append(strings.get(i) + " ");
        }
        stringBuilder.deleteCharAt(stringBuilder.length() - 1);

        return stringBuilder;
    }
}