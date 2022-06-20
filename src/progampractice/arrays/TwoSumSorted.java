package progampractice.arrays;

import java.util.Arrays;

public class TwoSumSorted {

    public static int[] twoSum(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int[] result = new int[2];
        while (start < end) {
            int sum = nums[start] + nums[end];
            if (sum == target) {
                result[0] = start++;
                result[1] = end--;
            } else if (sum < end) {
                start++;
            } else {
                end--;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(nums, target)));
    }
}
