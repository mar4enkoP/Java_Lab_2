package com;

import java.util.*;

public class Main {
    /**
     * Метод для создания рандомного масиа значений.
     * Принемающий: размер,минимальное значение,максимальное значение.
     */
    public static int[] randomArray(int size, int min, int max, int emptyCells) {
        int[] array;
        array = new int[size + emptyCells];
        System.out.print("Array: \n| ");
        for (int i = 0; i < size; i++) {
            array[i] = (int) Math.round((Math.random() * (max - min)) + min);
            System.out.print(array[i] + " | ");
        }
        System.out.print("\n");
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
        int[] array = randomArray(20, -10, 10, 0);
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) max++;
            if (array[i] < 0) min++;
            if (array[i] == 0) zero++;
        }
        System.out.println("\nmax: " + max + "\nmin: " + min + "\nZero: " + zero);
    }

    /**
     * Task 2
     * Дан массив, состоящий из 100 целых чисел. Вывести все числа, которые встречаются в этом массиве:
     * а) несколько раз;(Task59a)
     * б) только по одному разу.(Task59b)
     */
    public static void Task59a() {
        int[] array = randomArray(100, 0, 10, 0);
        HashSet<Integer> used = new HashSet<>();
        int counter = 0;
        int counterSecond = 0;
        for (int i = 0; i < array.length; i++) {
            if (used.contains(array[i])) {
                continue;
            } else {
                used.add(array[i]);
            }
            ArrayList<Integer> positions = new ArrayList<>();
            positions.add(i);
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    positions.add(j);
                    counter++;
                }
            }
            //а) несколько раз;
            for (Integer p : positions) {
                if (counter >= 1) {
                    System.out.print(array[p] + ", ");
                }
            }
            if (counter >= 1) {
                counter = 0;
                System.out.println();
            }
        }
    }

    public static void Task59b() {
        int[] array = randomArray(100, 0, 10, 0);
        HashSet<Integer> used = new HashSet<>();
        int counter = 0;
        int counterSecond = 0;
        for (int i = 0; i < array.length; i++) {
            if (used.contains(array[i])) {
                continue;
            } else {
                used.add(array[i]);
            }
            ArrayList<Integer> positions = new ArrayList<>();
            positions.add(i);
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] == array[j]) {
                    positions.add(j);
                    counter++;
                }
            }
            // один раз;
            for (Integer p : positions) {
                if (counter >= 1) {
                    counter = 0;
                    System.out.print(array[p] + ", ");
                    System.out.println();
                }
            }
        }
    }

    /**
     * Task 3
     * Дана последовательность целых чисел, оканчивающаяся числом 9999.
     * Количество чисел в последовательности не меньше двух.
     * Определить, есть ли в ней хотя бы одна пара соседних четных чисел.
     * В случае положительного ответа определить порядковые номера чисел первой из таких пар.
     */
    public static void Task84() {
        int[] array = {1, 2, 4, 8, 9, 7, 4, 5, 6, 1, 7, 999}; //2,4
        boolean flag = true;
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] % 2 == 0) {
                if ((array[i] == array[i + 1] + 2) || (array[i + 1] == array[i] + 2)) {
                    System.out.println("Two adjacent even-number detected, first number" + i + 1);
                    flag = false;
                    break;
                }
            }
        }
        if (flag) System.out.println("There is no sequence of adjacent even-number in the array.");
    }

    /**
     * Task 4
     * На k-e место одномерного массива вещественных чисел вставить число, равное максимальному элементу массива.
     */
    public static void Task109() {
        int size = 10;
        int[] array = randomArray(size, 0, 10, 1);
        int maxNumber = -16;
        int maxIndex = 2;
        int posInsert = 3;//местот для вставки числа(индекс)
        for (int i = 0; i < array.length; i++) {
            if (maxNumber <= array[i]) {
                maxNumber = array[i];
                maxIndex = i;
            }
        }
        for (int i = size; i >= maxIndex; --i) {
            array[i] = array[i - 1];
        }
        array[posInsert - 1] = maxNumber;
        for (int a = 0; a != array.length; a++) {
            System.out.print(array[a] + " | ");
        }
        System.out.println("\nMax number: " + maxNumber + " to position " + posInsert);
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
                    Task59a();
                    Task59b();
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