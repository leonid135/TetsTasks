package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        revers();
    }

    public static void revers() {
        int[] a;
        int lenght;
        Scanner inValue = new Scanner(System.in);
        System.out.println("Введите длину массива");
        lenght = inValue.nextInt();
        a = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            System.out.println("Введите " + i + " элемент массива");
            a[i] = inValue.nextInt();
        }
        for (int i = 0; i < lenght / 2; i++) {
            int t = a[i];
            a[i] = a[lenght - i - 1];
            a[lenght - i - 1] = t;
        }
        System.out.println("------result------");
        for (int i = 0; i < lenght; i++)
            System.out.println(a[i]);
    }
}

