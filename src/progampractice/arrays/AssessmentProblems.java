package progampractice.arrays;

import java.util.Arrays;

public class AssessmentProblems {
    public static void main(String[] args) {
        int[] num = {2, 0, 2, 2, 1, 1, 0};

        if(num.length==0 || num.length==1) return;
        int start = 0;
        int end = num.length - 1;
        int index = 0;
        while (start < end && index<=end) {
            if (num[index] == 0) {
                num[index] = num[start];
                num[start] = 0;
                start++;
                index++;
            } else if (num[index] == 2) {
                num[index] = num[end];
                num[end] = 2;
                end--;
            }
            else
            {
                index++;
            }
        }

        System.out.println(Arrays.toString(num));

    }

}
