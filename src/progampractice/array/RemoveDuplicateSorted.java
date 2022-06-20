package progampractice.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/*
* Write a program to remove duplicates from A Sorted array in Java? [using Temp array]
Write a program to remove duplicates from A Sorted array in Java? [without temp array]
* */
public class RemoveDuplicateSorted {
    public static void main(String[] args) {
        int[] num = {1,1,2,3,4,5,3,2,6,7,1};

        //With Temp
        /*int j =0;
        int[] temp = new int[num.length];
        for(int i =0;i < num.length-1; i++){
            if(num[i]!=num[i+1]){
                temp[j++]=num[i];
            }
        }
        temp[j++] = num[num.length-1];
        System.out.println(Arrays.toString(temp));*/

        //Without Temp
        Set<Integer> numSet = new HashSet<>();
        for(Integer numSetArr : num){
            if(numSet.add(numSetArr)){
            }
        }
        System.out.println(numSet);

        int range = numSet.size();
        int arr[] = new int[range];
        int i =0;
        for(int x: numSet){
            arr[i++] = x;
        }

        System.out.println(Arrays.toString(arr));

    }
}
