package youtubeJavaPractice;

import java.util.Scanner;

public class doWhileExercise {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        do {
            System.out.println("Input your number: ");
            number = sc.nextInt();
            System.out.println("here is your number: ");
            System.out.println(number);
        } while (number >= 0);

        System.out.println("The END");
    }
}
