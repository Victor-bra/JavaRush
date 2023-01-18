package com.javarush.task.task26.task2601;

/*
Почитать в инете про медиану выборки
*/

import java.util.Arrays;
import java.util.Comparator;

public class Solution {

    public static void main(String[] args) {
        //System.out.println(getMedian(new Integer[]{1,2,3,4,5,6,7,8}));
        //Arrays.stream(sort(new Integer[]{13, 8, 15, 5, 17})).forEach(System.out::println);
    }

    public static Integer[] sort(Integer[] array) {
        //implement logic here
        double mediana = getMedian(array);
        Arrays.sort(array, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                double x1 = o1.intValue() - mediana;
                double x2 = o2.intValue() - mediana;
                return (int)((x1*x1-x2*x2)*100);

            }
        });
        return array;
    }

    private static double getMedian(Integer[] array) {
        Arrays.sort(array);
        double result;
        int length = array.length;
        if (length % 2 == 1) result = array[length / 2];
        else result = (array[length / 2 - 1] + array[length / 2]) / 2.;
        return result;
    }
}