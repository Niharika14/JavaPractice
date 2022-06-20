package progampractice.integer;

import java.util.Arrays;

public class EvenOddInDigit {

    public static int[] CountEvenOddDigit(int num) {
        int reminder;
        int even_count = 0;
        int odd_count = 0;

        while (num > 0) {
            reminder = num % 10;
            if (reminder % 2 == 0) {
                even_count++;
            } else {
                odd_count++;
            }
            num = num / 10;
        }
        return new int[] {even_count, odd_count};
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(CountEvenOddDigit(423152357)));
    }
}