package progampractice.array;

/*
 * How to find duplicate number on Integer array in Java? or How to check if array contains a duplicate number?
 * */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateNumber {
    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 2, 1};
        System.out.println(Arrays.toString(num));

       /* //case1
        int count =0;
        for (int i = 0; i < num.length; i++) {
            for (int j = i+1; j < num.length; j++) {
                if (num[j] == num[i]) {
                    count++;
                }
            }
        }
        System.out.println("Integer Array has duplicate number: "+count);*/

        //Case2
        Set<Integer> numSet = new HashSet<Integer>();
        for(Integer numSetArr : num){
            if(!numSet.add(numSetArr)){
                System.out.println(numSetArr);
            }
        }
        System.out.println(numSet);
    }
}
