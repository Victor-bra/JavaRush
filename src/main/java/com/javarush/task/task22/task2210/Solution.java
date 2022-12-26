package com.javarush.task.task22.task2210;

/*
StringTokenizer
*/

import java.util.Arrays;
import java.util.StringTokenizer;

public class Solution {
    public static void main(String[] args) {
        Arrays.stream(getTokens("level22.lesson13.task01", ".")).forEach(System.out::println);
    }

    public static String[] getTokens(String query, String delimiter) {
        StringTokenizer tokenizer = new StringTokenizer(query,delimiter);
        String[] strings = new String[tokenizer.countTokens()];
        int i=0;
        while (tokenizer.hasMoreTokens()){
            strings[i++] = tokenizer.nextToken();
        }
        return strings;
    }
}