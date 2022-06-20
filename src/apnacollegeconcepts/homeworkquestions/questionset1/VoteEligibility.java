package apnacollegeconcepts.homeworkquestions.questionset1;

import java.util.Scanner;

/*
* Write a function that takes in age as input and returns if that person is eligible to vote or not.
* A person of age > 18 is eligible to vote.
* */
public class VoteEligibility {

    public static boolean voteEligibility(int age){
        boolean eligible = true;
        if(age < 18){
            eligible = false;
        }
        return eligible;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your age: ");
        int age = sc.nextInt();
        if(voteEligibility(age)){
            System.out.println("You are eligible for vote.");
        }
        else {
            System.out.println("You are not eligible for vote.");
        }
    }

}


