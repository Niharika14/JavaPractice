package progampractice.arrays;

public class RemoveElement {

    public static int removeElement(int[] nums, int val) {
        if(nums.length ==0 ) return 0;
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }

    public static void main(String[] args) {
        int[] nums = {};
        int val = 0;
        System.out.println(removeElement(nums, val));
    }
}
