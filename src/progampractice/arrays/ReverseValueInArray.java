package progampractice.arrays;

import java.util.Arrays;

public class ReverseValueInArray {

    public static int reverseDigit(int val) {
        int digit = 0;
        while (val > 0) {
            int rem = val % 10;
            val = val / 10;
            digit = digit * 10 + rem;
        }
        return digit;
    }

    public static void main(String[] args) {
        int[] num = {23, 132, 4544, 809832, 23432};
        System.out.println("Original Array" + Arrays.toString(num));
        int index = 0;
        for (int n : num) {
            num[index++] = reverseDigit(n);
        }
        System.out.println("Reversed Array" + Arrays.toString(num));
    }
}
