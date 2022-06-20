package apnacollegeconcepts.homeworkquestions.string;

import java.util.Scanner;

/*
Input a string from the user. Create a new string called ‘result’ in which you will replace the letter ‘e’ in the original string with letter ‘i’.
Example :
original = “eabcdef’ ; result = “iabcdif”
Original = “xyz” ; result = “xyz”
*/
public class ReplaceLetter {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your string:");
        String text = sc.next();
        String result = "";

        //Case1
        /*String result = text.replace('e','i');
        System.out.println(result);*/

        //Cae2
        for(int i =0; i<text.length(); i++){
            if(text.charAt(i)=='e'){
                result+='i';
            }
            else
            {
                result+=text.charAt(i);
            }
        }
        System.out.println(result);
    }
}
