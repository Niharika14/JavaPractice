package progampractice.array;

import java.util.Scanner;

/*
* How to find the missing number in integer array of 1 to 100? For Ex- if array is {1,2,4,5} and
* numbers of array are distinct within in range of 1-5 then if you see 3 is missing from the array.
*/
public class MissingNumber {

    public static void main(String[] args) {
        System.out.print("Please Enter Your Array Length: ");
        Scanner sc = new Scanner(System.in);
        int range = sc.nextInt();
        int[] arr = new int[range];
        System.out.print("Please Enter Your Arrays Value (n-1): ");
        for(int i = 0; i<range-1; i++){
            arr[i] = sc.nextInt();
        }

        //Case1
      /*  int arrSum =0;
        int sumOfAll =0;
        for(int i =1;i<=range;i++){
            arrSum = arrSum + arr[i-1];
            sumOfAll = sumOfAll+i;
        }

        System.out.println("Missing Number is: "+ (sumOfAll-arrSum));*/

        //Case2
        int sumOfAll=(range*(range+1))/2;
        int arrSum =0;
        for(int i=0;i<range-1;i++){
            arrSum = arrSum + arr[i];
        }

        System.out.println("Missing Number is: "+ (sumOfAll-arrSum));

    }

}
