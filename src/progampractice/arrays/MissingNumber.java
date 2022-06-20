package progampractice.arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int sumOfArr = 0;
        int n = nums.length;
        int actualSum = n * (n + 1) / 2;
        for (int i = 1; i <= nums.length; i++) {
            sumOfArr += nums[i - 1];
        }
        return actualSum - sumOfArr;
    }

    public static void main(String[] args) {
        int[] a = {0, 1};
        System.out.println(missingNumber(a));
    }
}
