package com.javarush.task.task34.task3403;

/*
Разложение на множители с помощью рекурсии
*/

public class Solution {
    public static void main(String[] args) {
        new Solution().recurse(132);
        new Solution().recurse(286);
        new Solution().recurse(15);
        new Solution().recurse(99);
    }
    public void recurse(int n) {
        if (n<=1) {
            System.out.println();
            return;
        }
        for(int i=2;i<=n;i++){
            if(n%i==0){
                System.out.print(i+" ");
                recurse(n/i);
                break;
            }
        }

    }
}