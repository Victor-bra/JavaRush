package com.javarush.task.task14.task1420;

/*
НОД
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int x2 = in.nextInt();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        addLists(x1, list1);
        addLists(x2, list2);

        list1.retainAll(list2);
        System.out.println(list1.stream().max(Integer::compare).get());
/*        list1.forEach(System.out::print);
        System.out.println();
        list2.forEach(System.out::print);*/
        in.close();
    }

    private static void addLists(int x, List<Integer> list) {
        for (int i = x; i > 0; i--) {
            if (x % i == 0)
                list.add(i);
        }
    }
}