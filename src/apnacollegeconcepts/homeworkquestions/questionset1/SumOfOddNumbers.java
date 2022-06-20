package apnacollegeconcepts.homeworkquestions.questionset1;

import java.util.Scanner;

/*
* Write a function to print the sum of all odd numbers from 1 to n.
 * */
public class SumOfOddNumbers {

    public static int sumOfOddNumbers(int n){
        int count = 0;
        for (int i =0;i<=n;i++){
            if(i%2!=0){
                System.out.print(i);
                count=count+i;
            }
        }
        System.out.println("");
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your number: ");
        int num = sc.nextInt();
        System.out.println("Sum of all odd Numbers is: "+sumOfOddNumbers(num));
    }
}
