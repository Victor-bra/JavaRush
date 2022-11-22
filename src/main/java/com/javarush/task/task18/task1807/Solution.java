package com.javarush.task.task18.task1807;

/*
Подсчет запятых
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine())){
            int codeSearch = 44;
            int coll = 0;
            while(inputStream.available()>0){
                int code = inputStream.read();
                if(codeSearch== code)
                    coll++;
            }
            System.out.println(coll);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}