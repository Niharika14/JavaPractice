package progampractice.arrays;

import java.util.Arrays;

public class DuplicateZeroes {
    public static void duplicateZeros(int[] arr) {
        int length = arr.length - 1;
        for (int i = 0; i < length; i++) {
            if (arr[i] == 0) {
                System.out.println(i);
                for (int j = length - 1; j >= i; j--) {
                    arr[j + 1] = arr[j];
                }
                System.out.println(i);
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void main(String[] args) {
        int[] a = {1, 0, 2, 3, 0, 4, 5, 0};
        duplicateZeros(a);
    }
}
