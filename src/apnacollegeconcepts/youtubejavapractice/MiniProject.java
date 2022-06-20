package youtubeJavaPractice;

import java.util.Scanner;

public class MiniProject {
    public static void main(String[] args) {
        int myNumber = (int) (Math.random() * 100);
        Scanner sc = new Scanner(System.in);
        int userNumber = 0;
        do {
            System.out.println("Guess my Number(1-100): ");
            userNumber = sc.nextInt();
            if (userNumber == myNumber) {
                System.out.println("Wooo! you guess the correct Number");
                break;
            } else if (userNumber > myNumber) {
                System.out.println("Your Number is too large");
            } else {
                System.out.println("Your number is too short");
            }
        } while (userNumber >= 0);

        System.out.println("My Number was: " + myNumber);
    }
}
