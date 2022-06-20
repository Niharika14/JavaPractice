package progampractice.array;

import java.util.Arrays;

/*
Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number.
Input: numbers = [2,7,11,15], target = 9
Output: [1,2]
Explanation: The sum of 2 and 7 is 9. Therefore, index1 = 1, index2 = 2. We return [1, 2]
* */
public class TwoPointerTechnique {

    public static int[] twoSumSorted(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        int resArr[] = new int[2];

        while (start < end) {
            int sum = arr[start] + arr[end];
            if (sum == target) {
                resArr[0] = start++;
                resArr[1] = end++;
                System.out.println(Arrays.toString(resArr));
                break;
            } else if (sum < target) {
                start++;
            } else {
                end--;
            }
        }
        return resArr;
    }

    /*
     * Maximum Size SubArray Of Size K
     *
     *  int [] a={3,2,6,-1,4,5,-1,2}
     * k = 3
     * */
    public static void twoSumUnSorted(int[] num, int k) {

        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {

            }
        }

    }

    public static void main(String[] args) {
        int num[] = {2, 3, 7, 11, 15};
        int target = 9;
        int[] result = twoSumSorted(num, target);


        System.out.println("The sum of " + num[result[0]] + " and " + num[result[1]] + " is " + target + ". Therefore, index1 = " + result[0] + ", index2 = " + result[1] + ". We return [" + result[0] + " , " + result[1] + "]");

    }
}