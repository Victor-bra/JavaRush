package com.javarush.task.task36.task3605;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.TreeSet;

/*
Использование TreeSet
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        TreeSet<Character> treeSet = new TreeSet<>();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]))) {
            String str;
            while ((str = reader.readLine()) != null) {
                for(char ch: str.toLowerCase().toCharArray())
                    if(ch>=97 && ch<=122)
                        treeSet.add(ch);
            }
        }
        int count=0;
        for(Character ch: treeSet) {
            if (count < 5) {
                System.out.print(ch);
                count++;
            }
        }
    }
}