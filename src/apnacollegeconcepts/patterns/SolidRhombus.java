package apnacollegeconcepts.patterns;

import java.util.Scanner;

public class SolidRhombus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter value for n: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            //for Space
            int space = n - i;
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }

            //for star
            for (int j = 1; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
