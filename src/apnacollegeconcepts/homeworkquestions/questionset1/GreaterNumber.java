package apnacollegeconcepts.homeworkquestions.questionset1;

import java.util.Scanner;

/*
* Write a function which takes in 2 numbers and returns the greater of those two.
* */
public class GreaterNumber {

    public static int greaterNumber(int a, int b){
        int greater = a;
        if (a<b){
            greater=b;
        }
        return greater;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your 1st Number: ");
        int a = sc.nextInt();

        System.out.print("Please Enter your 2nd Number: ");
        int b = sc.nextInt();

        int greater = greaterNumber(a,b);
        if(greater == a){
            System.out.println(a+" is greater than "+b);
        }
        else
        {
            System.out.println(b+" is greater than "+a);
        }
    }
}
