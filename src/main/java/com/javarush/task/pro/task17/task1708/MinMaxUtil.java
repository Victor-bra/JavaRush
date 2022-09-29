package com.javarush.task.pro.task17.task1708;

/*
Минимальное и максимальное
*/

public class MinMaxUtil {
    public static int min(int x, int y) {
        return Math.min(x, y);
    }

    public static int min(int x, int y, int z) {
        return Math.min(Math.min(x, y), z);
    }

    public static int min(int x, int y, int z, int g) {
        return Math.min(Math.min(Math.min(x, y), z), g);
    }

    public static int min(int x, int y, int z, int g, int h) {
        return Math.min(Math.min(Math.min(Math.min(x, y), z), g), h);
    }

    public static int max(int x, int y) {
        return Math.max(x, y);
    }

    public static int max(int x, int y, int z) {
        return Math.max(Math.max(x, y), z);
    }

    public static int max(int x, int y, int z, int g) {
        return Math.max(Math.max(Math.max(x, y), z), g);
    }

    public static int max(int x, int y, int z, int g, int h) {
        return Math.max(Math.max(Math.max(Math.max(x, y), z), g), h);
    }

}