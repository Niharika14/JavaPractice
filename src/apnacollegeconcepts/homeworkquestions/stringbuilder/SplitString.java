package apnacollegeconcepts.homeworkquestions.stringbuilder;

import java.util.Scanner;
/*
Input an email from the user. You have to create a username from the email by deleting the part that comes after ‘@’. Display that username to the user.
Example :
email = “apnaCollegeJava@gmail.com” ; username = “apnaCollegeJava”
email = “helloWorld123@gmail.com”; username = “helloWorld123”
*/
public class SplitString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter your Email Address: ");
        StringBuilder email = new StringBuilder(sc.next());
        StringBuilder result = new StringBuilder();

        //Case1 : 106600 Time
        int index = email.indexOf("@");
        System.out.println(email.substring(0,index));


        //Case2 :74200 Time
        for(int i =0; i<=email.length();i++){
            if(email.charAt(i)=='@'){
                break;
            }
            else {
                result.append(email.charAt(i));
            }
        }
        System.out.println(result);
    }
}
