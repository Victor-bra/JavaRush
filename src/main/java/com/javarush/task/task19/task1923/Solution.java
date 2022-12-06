package com.javarush.task.task19.task1923;

/*
Слова с цифрами
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        if (args.length <= 1)
            throw new RuntimeException();
        try (BufferedReader reader = new BufferedReader(new FileReader(args[0]));
             BufferedWriter writer = new BufferedWriter(new FileWriter(args[1]))) {
            while (reader.ready()) {
                String[] str = reader.readLine().split(" ");
                for (String strings : str) {
                    if (strings.matches("(.*[0-9]+.*)"))
                        writer.write(strings + " ");
                }
            }
        }
    }
}