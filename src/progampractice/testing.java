package progampractice;

import java.util.Arrays;

public class testing {

    public static void main(String[] args) {


      /*  int[] num1 = {1, 2, 3, 0, 0, 0};
        int[] num2 = {2, 4, 5};
        int m = 3, n = 3;
*/
        int[] num1 = {0};
        int m = 0, n = 2;
        int[] num2 = {1, 2};

        int i = m - 1;
        int j = n - 1;
        int k = n + m - 1;

        while (i >= 0 && j >= 0) {

            if (num1[i] < num2[j]) {
                num1[k--] = num2[j--];
            } else {
                num1[k--] = num1[i--];
            }
        }

        while (j >= 0) {
            num1[j] = num2[j];
            j--;
        }

        System.out.println(Arrays.toString(num1));

    }
}