package com.javarush.task.task18.task1808;

/*
Разделение файла
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine());
            FileOutputStream outputStream1 = new FileOutputStream(new Scanner(System.in).nextLine());
            FileOutputStream outputStream2 = new FileOutputStream(new Scanner(System.in).nextLine())){

            if(inputStream.available()>0){
                byte[] array1 = new byte[(int) Math.floor((inputStream.available()+1)/2)];
                byte[] array2 = new byte[(int) Math.ceil((inputStream.available()+1)/2)];
                int count1 = inputStream.read(array1);
                int count2 = inputStream.read(array2);
                outputStream1.write(array1, 0, count1);
                outputStream2.write(array2, 0, count2);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}