package youtubeJavaPractice;

import java.util.Scanner;

public class inputClassInJava {
    public static void main(String[] args) {
        //how to take input
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int age = sc.nextInt();
        System.out.println("Your age is " + age);

        System.out.println("Enter your age: ");
        float ageFloat = sc.nextFloat();
        System.out.println("Your age is " + ageFloat);

        // next will take only single word
        System.out.println("Enter your Name: ");
        String name = sc.next();
        System.out.println(name);

        sc = new Scanner(System.in);
        System.out.println("Enter your Name more than one word: ");
        String name1 = sc.nextLine();
        System.out.println("Your string is: " + name1);
    }
}