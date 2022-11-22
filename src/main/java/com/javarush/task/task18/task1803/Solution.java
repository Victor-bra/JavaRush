package com.javarush.task.task18.task1803;

/*
Самые частые байты
*/

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
    public static Map<Integer, Integer> byteMaps = new HashMap<>();

    public static void main(String[] args) throws Exception {
        readFileToMap();
        int maxValue = Integer.MIN_VALUE;
        for (Map.Entry<Integer, Integer> byteMap : byteMaps.entrySet()) {
            if (byteMap.getValue() > maxValue)
                maxValue = byteMap.getValue();
        }

        for (Map.Entry<Integer, Integer> byteMap : byteMaps.entrySet()) {
            if (byteMap.getValue() == maxValue)
                System.out.print(byteMap.getKey() + " ");
        }
    }

    public static void readFileToMap() {
        try (FileInputStream inputStream = new FileInputStream(new Scanner(System.in).nextLine())) {
            while (inputStream.available() > 0) {
                int redByte = inputStream.read();
                boolean f = false;
                for (Map.Entry<Integer, Integer> byteMap : byteMaps.entrySet()) {
                    if (byteMap.getKey() == redByte) {
                        byteMap.setValue(byteMap.getValue() + 1);
                        f = true;
                        break;
                    }
                }
                if (!f)
                    byteMaps.put(redByte, 1);
            }
            //System.out.println(byteMaps.toString());
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}