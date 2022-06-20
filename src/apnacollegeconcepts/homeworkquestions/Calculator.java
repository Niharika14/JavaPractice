package apnacollegeConcepts.homeWorkQuestions;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter a value: ");
        int a = sc.nextInt();
        System.out.print("Please Enter b value: ");
        int b = sc.nextInt();
        System.out.println("Please select operator(1-5): \n" +
                "1 -> +\n" +
                "2 -> -\n" +
                "3 -> *\n" +
                "4 -> /\n" +
                "5 -> %");
        int operator = sc.nextInt();

        switch (operator) {
            case 1:
                System.out.println(a + b);
                break;
            case 2:
                System.out.println(a - b);
                break;
            case 3:
                System.out.println(a * b);
                break;
            case 4:
                if (b == 0) {
                    System.out.println("Invalid division");
                } else {
                    System.out.println(a / b);
                }
                break;
            case 5:
                if (b == 0) {
                    System.out.println("Invalid Division");
                } else {
                    System.out.println(a % b);
                }
                break;
            default:
                System.out.println("You provided invalid operator number. Please try again next time with correct operator number.");

        }

    }
}
