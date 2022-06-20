package apnacollegeconcepts.homeworkquestions.questionset1;

import java.util.Scanner;

/*
* Write a function that takes in the radius as input and returns the circumference of a circle.
 * */
public class CircleCircumference {

    public static float circleCircumference(int radius){
        float pi = (float)Math.PI;
        return 2*pi*radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter radius to find the Circle Circumference: ");
        int radius = sc.nextInt();
        System.out.println("Circumference of Circle is: "+circleCircumference(radius));
    }

}
