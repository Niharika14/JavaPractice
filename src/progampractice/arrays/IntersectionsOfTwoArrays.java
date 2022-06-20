package progampractice.arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class IntersectionsOfTwoArrays {

    public static int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0;
        int j = 0;

        ArrayList<Integer> newArr = new ArrayList<>();
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] == nums2[j]) {
                newArr.add(nums1[i]);
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else {
                j++;
            }
        }

        int index = 0;
        int[] arr = new int[newArr.size()];
        for (Integer val : newArr) {
            arr[index++] = val;
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] nums1 = {4,9,5};
        int[] nums2 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(nums1, nums2)));
    }
}
