package com.jokercode.java.sorting;

import java.lang.reflect.Array;
import java.util.Arrays;

public class QuickSort {

    static int iterations = 0;

    static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pivot  = arr[high];
            int i = (low - 1);

            for (int j = low; j <= high - 1; j++) {
                if (arr[j] < pivot) {
                    i++;
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }

            int tmp = arr[i + 1];
            arr[i + 1] = arr[high];
            arr[high] = tmp;
            pivot = i + 1;

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }

        iterations++;
    }

    public static void main(String[] args) {
        int[] list = {9, 1, 34, 20, 2, 7, 12, 4, 6, 8};
        quickSort(list, 0, list.length - 1);
        System.out.println("Iteraciones: " + iterations);
        System.out.println(Arrays.toString(list));
    }
}
