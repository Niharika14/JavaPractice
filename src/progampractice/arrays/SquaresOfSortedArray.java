package progampractice.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SquaresOfSortedArray {
  /*  public static int[] sortedSquares(int[] nums) {
        int[] sort = new int[nums.length];
        for(int i=0; i<nums.length;i++){
            sort[i]=nums[i]*nums[i];
        }

        return sort;
    }*/

    public static int[] sortedSquares(int[] nums) {
        for(int i=0; i<nums.length;i++) {
            nums[i] = nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        int[] a = {-7,-3,2,3,11};
        int[] sort = new int[a.length];
        for(int i=0; i<a.length;i++){
            sort[i]=a[i]*a[i];
        }
        Arrays.sort(sort);
        System.out.println(Arrays.toString(sort));
    }
}
