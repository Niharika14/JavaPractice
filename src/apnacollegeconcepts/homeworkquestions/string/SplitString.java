package apnacollegeconcepts.homeworkquestions.string;

/*
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example :
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
email = “helloWorld123@gmail.com”; username = “helloWorld123”
*/

import java.util.Arrays;
import java.util.Scanner;

public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your Email Address: ");
        String email = sc.next();
        String userName = "";

        //Case1:
       String[] useName;
       useName = email.split("@");
       System.out.println(useName[0]);

        //Case2:
        for(int i =0; i<email.length(); i++){
            if(email.charAt(i) == '@'){
                break;
            }
            else{
                userName = userName +email.charAt(i);
            }
        }
        System.out.println(userName);
    }
}
