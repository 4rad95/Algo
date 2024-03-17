package org.example.Lesson_6.hw;

public class QuickSort1 {

    public static void sort(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int pivot = arr[(left + right) / 2];
            int i = left;
            int j = right;

            while (i <= j) {
                while (arr[i] < pivot) {
                    i++;
                }
                while (arr[j] > pivot) {
                    j--;
                }

                if (i <= j) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    i++;
                    j--;
                }
            }

            if (left < j) {
                right = j;
            }
            if (i < right) {
                left = i;
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 3, 1, 2, 4};
        sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}