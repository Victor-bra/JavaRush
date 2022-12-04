package com.javarush.task.task19.task1908;

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
             BufferedReader bufferedReader = new BufferedReader(new FileReader(reader.readLine()));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(reader.readLine()))) {
            String str = "";
            while (bufferedReader.ready()) {
                str += bufferedReader.readLine();
            }

            String[] strings = str.split(" ");
            for(String s: strings){
                try{
                    int x = Integer.parseInt(s);
                    bufferedWriter.write(x + " ");
                } catch (Exception e){

                }
            }
            //Arrays.stream(strings).forEach(System.out::println);
        }
    }
}