package progampractice.arrays;

import java.util.Arrays;

public class RotateArray {

    public static int[] rotate(int[] nums, int k) {
        k=k%nums.length;
        reverse(nums, 0, nums.length-1);
        reverse(nums, 0,k-1);
        reverse(nums,k, nums.length-1);

        return nums;
    }

    public static void reverse(int[] num, int start, int end){
        while(start<end){
            int temp = num[start];
            num[start] = num[end];
            num[end] = temp;

            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,6,7};
        int k = 0;

        System.out.println(Arrays.toString(rotate(nums,k)));
    }
}
