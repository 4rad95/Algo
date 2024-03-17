package org.example.Lesson_6.hw;

// 1 уровень сложности: 1. Quick sort пишем еще раз “с чистого листа”, но сортировка в порядке убывания значения.

public class QuickSort {

    public static void main(String[] args) {
        int[] numbers = {1, 5, 3, 2, 4};

        quickSort(numbers, 0, numbers.length - 1);

        for (int number : numbers) {
            System.out.print(number + " ");
        }

        System.out.println();
    }

    private static void quickSort(int[] numbers, int low, int high) {
        if (low < high) {
            int pivot = partition(numbers, low, high);

            quickSort(numbers, low, pivot - 1);
            quickSort(numbers, pivot + 1, high);
        }
    }

    private static int partition(int[] numbers, int low, int high) {
        int pivot = numbers[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (numbers[j] > pivot) {
                i++;

                int temp = numbers[i];
                numbers[i] = numbers[j];
                numbers[j] = temp;
            }
        }

        int temp = numbers[i + 1];
        numbers[i + 1] = numbers[high];
        numbers[high] = temp;

        return i + 1;
    }
}