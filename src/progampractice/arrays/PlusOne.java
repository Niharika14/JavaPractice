package progampractice.arrays;

import java.util.Arrays;

public class PlusOne {
    public static int[] plusOne(int[] digits) {

        int n = digits.length;
        for(int i = n-1;i>0;i--){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i]=0;
        }

        int[] newArr= new int[n+1];
        newArr[0]=1;
        return newArr;
    }

    public static void main(String[] args) {
        int[] nums1 = {9,8,7,6,5,4,3,2,1,0};
        System.out.println(Arrays.toString(plusOne(nums1)));
//        System.out.println(Arrays.toString(plusOne("9")));
    }
}