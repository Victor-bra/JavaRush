package com.javarush.task.task13.task1319;

/*
Писатель в файл с консоли
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        // напишите тут ваш код
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder stringBuilder = new StringBuilder();
        String filePath = bufferedReader.readLine();

        while(true){
            String str = bufferedReader.readLine();
            stringBuilder.append(str).append("\n");
            if(str.equals("exit"))
                break;
        }
        bufferedReader.close();

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filePath));
        bufferedWriter.write(stringBuilder.toString());;
        bufferedWriter.close();
    }
}