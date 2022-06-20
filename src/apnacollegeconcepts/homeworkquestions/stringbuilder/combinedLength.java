package apnacollegeconcepts.homeworkquestions.stringbuilder;

/*
 * Take an array of Strings input from the user & find the cumulative (combined) length of all those strings.
 */

import java.util.Scanner;

public class combinedLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter size of your array: ");
        int size = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for(int i = 0; i<size; i++){
            System.out.print("Please enter your "+i+" value: ");
            sb.append(sc.next());
        }
        System.out.println(sb.length());
    }
}