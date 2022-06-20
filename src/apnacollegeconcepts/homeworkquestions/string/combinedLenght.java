package apnacollegeconcepts.homeworkquestions.string;

/*
* Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
* */

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class combinedLenght {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter size of your array: ");
        int size = sc.nextInt();
        String[] arr = new String[size];
        int totalLength = 0;
        for(int i=0; i<arr.length ;i++ ){
            System.out.println("Please enter "+(i+1)+" value");
            arr[i] = sc.next();
            totalLength = totalLength + arr[i].length();
        }
        System.out.println(Arrays.toString(arr) + totalLength);
    }
}
