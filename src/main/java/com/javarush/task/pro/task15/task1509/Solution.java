package com.javarush.task.pro.task15.task1509;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/*
Еще раз читаем из консоли
*/

public class Solution {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            String line = in.nextLine();
            char[] chars = line.toCharArray();
            Set<Character> characters = new HashSet<>();
            for (char aChar : chars) {
                if (Character.isAlphabetic(aChar)) {
                    characters.add(Character.toLowerCase(aChar));
                }
            }
            System.out.println(characters);
        }
    }
}