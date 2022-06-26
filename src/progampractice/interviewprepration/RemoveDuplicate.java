package progampractice.interviewprepration;

import java.util.Arrays;

public class RemoveDuplicate {

    public static void main(String[] args) {
        int index = 0;
        int[] num = {1, 2, 3, 4, 5, 5, 6, 7, 8};
        for (int i = 0; i < num.length - 1; i++) {
            if (num[i] != num[i + 1]) {
                num[index++] = num[i];
            }
        }
        num[index++] = num[num.length - 1];

        System.out.println(Arrays.toString(num));
    }
}
