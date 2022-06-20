package apnacollegeconcepts.patterns;

import java.util.Scanner;

public class HollowButterfly {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provide number to make a number triangle: ");
        int n = sc.nextInt();


        //UpperHalf
        for (int i = 1; i <= n; i++) {
            //for Starting star
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //for Space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //for Ending star
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }

        //lowerhalf
        for (int i = n; i >= 1; i--) {
            //for Starting star
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            //for Space
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //for Ending star
            for (int j = 1; j <= i; j++) {
                if (j == 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
