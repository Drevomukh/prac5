package ru.mirea.prac5;


import java.util.Scanner;

public class Main {
    public static String recursion(int n) {
        if (n == 1) {
            return "1";
        }

        return recursion(n - 1) + " " + n;
    }

    public static void main(String[] args) {

        System.out.println(recursion(10));
    }
}
