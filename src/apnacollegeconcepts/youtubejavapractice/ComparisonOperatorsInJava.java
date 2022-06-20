package youtubeJavaPractice;

import java.util.Scanner;

public class ComparisonOperatorsInJava {
    public static void main(String[] args) {
        //Comparison Operators
        /*a == b
          a != b
          a >= b -- a <= b
          a > b -- a < b*/

        //Conditional Statements
        boolean isSunUp = true;
        if (isSunUp == true)
            System.out.println("Day");
        else
            System.out.println("Night");

        int age = 30;
        if (age > 18)
            System.out.println("Can Vote");
        else
            System.out.println("Can't Vote");

        //Logical Operators
        // && and
        // || or
        int a = 60;
        int b = 60;
        if (a < 50 && b < 50)
            System.out.println("Both are less than 50");
        else
            System.out.println("Both are not more than 50");

        if (a < 50 || b < 50)
            System.out.println("At least one less than 50");
        else
            System.out.println("Both are more than 50");


        boolean isAdult = false;
        if (isAdult)
            System.out.println("is adult");
        else
            System.out.println("not adult");

        if (!isAdult)
            System.out.println("is adult");
        else
            System.out.println("not adult");

        // Conditional Statement
        Scanner sc = new Scanner(System.in);
        // pen =10; notebook =40
        System.out.println("Enter amount: ");
        int cash = sc.nextInt();
        if (cash < 10) {
            System.out.println("Can not buy anything");
            System.out.println("get more Cash");
        } else if (cash >= 10 && cash < 50) {
            System.out.println("Can get 1 thing");
        } else {
            System.out.println("Can get both");
        }
    }
}
