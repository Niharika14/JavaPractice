package apnacollegeconcepts.homeworkquestions.stringbuilder;

/*
Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
Example :
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
*/

import java.util.Scanner;

public class ReplaceLetter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter your string : ");
        StringBuilder sb = new StringBuilder(sc.next());

        for (int i = 0; i < sb.length(); i++) {
            if(sb.charAt(i)=='e'){
                sb.setCharAt(i,'i');
            }
        }
        System.out.println(sb);
    }
}
