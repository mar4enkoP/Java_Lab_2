package com;

import java.util.Scanner;
import java.util.Arrays;

public class Main {
    /**
     * Метод для создания рандомного масиа значений.
     * Принемающий: размер,минимальное значение,максимальное значение.
     */
    public static int[] randomArray(int size, int min, int max) {
        int[] array;
        array = new int[size];
        System.out.print("Array: \n| ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * (min - max)) - min);
            System.out.print(array[i]+" | ");
        }
        return array;
    }

    /**
     * Task 000
     * Функция для вычесления номера заданий
     */
    public static void Variant() {
        int ans, N, K, G;
        N = 11;   // порядковый номер студента по журналу
        K = 0;    // порядковый номер выполняемой задачи
        G = 211 % 2;//остаток от деления номера группы на 2
        while (K != 5) {
            K++;
            ans = (22 + N + (K - 1) * 25) + G;
            System.out.println(K + ") = " + ans);
        }
    }

    /**
     * Task 1
     * Дан массив вещественных чисел, размер которого N.
     * Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
     */
    public static void Task34() {
        int max = 0, min = 0, zero = 0;
        int[] array = randomArray(20, -10, 10);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) max++;
            if (array[i] < 0) min++;
            if (array[i] == 0) zero++;
        }
        System.out.println("\nmax: " + max +"\nmin: " + min +"\nZero: " + zero);
    }

    /**
     * Task 2
     */
    public static void Task59() {

    }

    /**
     * Task 3
     */
    public static void Task84() {

    }

    /**
     * Task 4
     */
    public static void Task109() {

    }

    /**
     * Task 5
     */
    public static void Task134() {

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i != 5; i++) {
            System.out.print("\nEnter the task number: ");
            int Num = scanner.nextInt();
            switch (Num) {
                case 1:
                    System.out.println("\nTask 1");
                    Task34();
                    break;
                case 2:
                    System.out.println("\nTask 2");
                    Task59();
                    break;
                case 3:
                    System.out.println("\nTask 3");
                    Task84();
                    break;
                case 4:
                    System.out.println("\nTask 4");
                    Task109();
                    break;
                case 5:
                    System.out.println("\nTask 5");
                    Task134();
                    break;
                case 000:
                    System.out.println("\nVariant");
                    Variant();
                    break;
            }
        }
    }

}