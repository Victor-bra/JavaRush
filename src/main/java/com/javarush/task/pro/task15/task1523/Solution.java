package com.javarush.task.pro.task15.task1523;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/*
Получение информации по API
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://httpbin.org/post");
        //напишите тут ваш код
        URLConnection connection = url.openConnection();

        connection.setDoOutput(true);

        try (OutputStream outputStream = connection.getOutputStream();
             PrintStream printStream = new PrintStream(outputStream)) {
            printStream.println("Hello");
        }

        try (InputStream inputStream = connection.getInputStream();
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream))) {
            while (reader.ready())
                System.out.println(reader.readLine());
        }

    }
}