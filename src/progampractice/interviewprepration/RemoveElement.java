package progampractice.interviewprepration;

import java.util.Arrays;

public class RemoveElement {
    public static void removeElement(int[] num, int ele) {

        for (int i = 0; i < num.length; i++) {
            if (num[i] == ele) {
                for (int j = i; j < num.length - 1; j++) {
                    num[j] = num[j + 1];
                }
                break;
            }

        }
        num[num.length - 1] = 0;
        System.out.println(Arrays.toString(num));
    }

    public static void main(String[] args) {

        int[] num = {12, 1, 3, 5, 6, 8, 9};
        int ele = 3;
        removeElement(num, ele);
    }
}
