package com.javarush.task.task18.task1819;

/*
Объединение файлов
*/

import java.io.*;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /*Scanner in = new Scanner(System.in);
        String firstFileName = in.nextLine();
        String secondFileName= in.nextLine();
        try(FileInputStream inputStream = new FileInputStream(firstFileName);
            FileOutputStream outputStream = new FileOutputStream(secondFileName, true)){
            while (inputStream.available()>0)
                outputStream.write(inputStream.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try(FileInputStream inputStream = new FileInputStream(secondFileName);
            FileOutputStream outputStream = new FileOutputStream(firstFileName)){
            while (inputStream.available()>0)
                outputStream.write(inputStream.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }*/
        Scanner in = new Scanner(System.in);
        String firstFileName = in.nextLine();
        String secondFileName = in.nextLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream inputStream1 = new FileInputStream(firstFileName);
             FileInputStream inputStream2 = new FileInputStream(secondFileName)) {
            while (inputStream2.available() > 0)
                byteArrayOutputStream.write(inputStream2.read());
            while (inputStream1.available() > 0)
                byteArrayOutputStream.write(inputStream1.read());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        try (FileOutputStream outputStream = new FileOutputStream(firstFileName)) {
            byteArrayOutputStream.writeTo(outputStream);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}