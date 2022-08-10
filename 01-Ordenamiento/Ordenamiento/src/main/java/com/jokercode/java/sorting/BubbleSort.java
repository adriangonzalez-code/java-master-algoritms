package com.jokercode.java.sorting;

public class BubbleSort {

    public static void main(String[] args) {
        int[] list = {9, 1, 34, 20, 2, 7, 12, 4, 6, 8};
        sort(list);
    }

    static void sort(int[] list) {

        for (int i : list) {
            System.out.print(" " + i);
        }

        System.out.println();

        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if (list[i] < list[j]) {
                    int tmp = list[i];
                    list[i] = list[j];
                    list[j] = tmp;
                }
            }
        }

        for (int i : list) {
            System.out.print(" " + i);
        }

        System.out.println();
    }
}
