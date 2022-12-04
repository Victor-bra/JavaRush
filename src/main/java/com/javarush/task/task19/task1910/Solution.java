package com.javarush.task.task19.task1910;

/*
Пунктуация
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
            String str = "";
            while (bufferedReader.ready())
                str += bufferedReader.readLine();
            str = str.replaceAll("\\p{Punct}", "");
            str = str.replaceAll("\\n", "");
            bufferedWriter.write(str);
        }
    }
}