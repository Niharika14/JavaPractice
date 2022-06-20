package progampractice.array;

/*
 * How to check if array contains a given number in Java?
 * */

import java.util.Arrays;

public class ShiftZeroElements {

    public static int[] shiftingToRight(int[] arrShift) {

        int count = 0;
        int newArr[] = new int[arrShift.length];
        for (int x : arrShift) {
            if (x != 0) {
                newArr[count++] = x;
            }
        }
        return newArr;
    }

    public static int[] shiftingLeft(int[] arrShift) {

        int count = arrShift.length - 1;
        int[] newArr = new int[arrShift.length];
        for (int x : arrShift) {
            if (x != 0) {
                newArr[count--] = x;
            }
        }
        return newArr;
    }

    public static void main(String[] args) {
        int arr[] = {1, 2, 0, 4, 0, 0, 0, 5, 0, 9};
        System.out.println("Original Array: "+Arrays.toString(arr));
        int[] rightArray = shiftingToRight(arr);
        System.out.println("Shifting to Right: "+Arrays.toString(rightArray));
        int[] leftArray = shiftingLeft(arr);
        System.out.println("Shifting to Left: "+Arrays.toString(leftArray));
    }
}
