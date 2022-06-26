package progampractice.interviewprepration;

import java.util.Arrays;

public class SearchElement {
    public static void searchElement(int[] num, int ele) {

        int index =0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] == ele) {
                index = i;
                break;
            }
        }
        System.out.println("Element "+num[index]+" found at "+ index+" position");
    }

    public static void main(String[] args) {

        int[] num = {12, 1, 3, 5, 6, 8, 9};
        int ele = 3;
        System.out.println(Arrays.toString(num));
        searchElement(num, ele);
    }
}
