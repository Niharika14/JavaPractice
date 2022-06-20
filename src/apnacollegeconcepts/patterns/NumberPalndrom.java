package apnacollegeconcepts.patterns;

import java.util.Scanner;

public class NumberPalndrom {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provide number to make a number triangle: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            //1st half
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }

            //2nd Half
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
