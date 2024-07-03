package me.algo.monster.sorting;

public class InsertionSort {
    public static void sort(int[] arr) {
        // return if arr is null or empty or single element
        if (arr == null || arr.length <= 1) {
            return;
        }

        // array of [0..i-1] is sorted
        // every iteration we put the `i`th element into the right position of sorted
        // array
        // swap the current element with the
        // single element array is sorted, so we start with the 2nd one
        for (int i = 1; i < arr.length; i++) {
            // every iteration we compare arr[j] with arr[j - 1], swap them if arr[j] <
            // arr[j -1]
            // break otherwise because we have put arr[j] at the right place aready
            for (int j = i; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                } else
                    break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int t = arr[i];
        arr[i] = arr[j];
        arr[j] = t;
    }
}
