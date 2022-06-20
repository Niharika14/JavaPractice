package progampractice.arrays;

import java.util.Arrays;

public class MergeSortedArray {

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int fistArray = m - 1;
        int secondArray = n - 1;
        int index = m + n - 1;

        while (secondArray >= 0 && fistArray>=0) {
            if ((nums1[fistArray] > nums2[secondArray])  ) {
                nums1[index--] = nums1[fistArray--];

            } else {
                nums1[index--] = nums2[secondArray--];
            }
        }

        while(secondArray>=0){
            nums1[secondArray] = nums2[secondArray];
            secondArray--;
        }

        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {0};
        int m = 0;
        int[] nums2 = {1};
        int n = 1;
        merge(nums1, m, nums2, n);
    }
}
