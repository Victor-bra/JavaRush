package com.javarush.task.task18.task1817;

/*
Пробелы
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) {
        if(args[0]==null)
            return;
        int collWhitespace = 0;
        int collChar = 0;
        try(FileInputStream inputStream = new FileInputStream(args[0])){
            while (inputStream.available()>0){
                collChar++;
                if(inputStream.read()==32)
                    collWhitespace++;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        double x = (double) collWhitespace/collChar*100;
        System.out.printf("%.2f", x);
    }
}