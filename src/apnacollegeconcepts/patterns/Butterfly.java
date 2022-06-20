package apnacollegeconcepts.patterns;

import java.util.Scanner;

public class Butterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner((System.in));
        System.out.print("Please enter value for n: ");
        int n = sc.nextInt();

        //UpperHalf
        for (int i = 1; i <= n; i++) {
            //for Starting star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //for Space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //for Ending star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        //LowerHalf
        for (int i = n; i >= 1; i--) {
            //for Starting star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            //for Space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //for Ending star
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}
