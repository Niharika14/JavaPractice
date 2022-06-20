package apnacollegeconcepts.homeworkquestions.questionset1;

import java.util.Scanner;

/*
* Enter 3 numbers from the user & make a function to print their average.
*/
public class AvgOfGivenNumber {

    public static int avgOfNumber(int num1, int num2, int num3){
        int avg=(num1+num2+num3)/3;
        return avg;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Please Enter 2nd Number: ");
        int b = sc.nextInt();

        System.out.print("Please Enter 3rd Number: ");
        int c = sc.nextInt();

        System.out.println("Avg number of given 3 number is: "+avgOfNumber(a,b,c));
    }
}
