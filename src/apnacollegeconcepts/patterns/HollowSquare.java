package Patterns;

/*
 * *****
 * *   *
 * *   *
 * *   *
 * *****
 * */

import java.util.Scanner;

public class HollowSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provide row number to make a Hollow square: ");
        int n = sc.nextInt();
        System.out.print("Please provide column number to make a Hollow square: ");
        int m = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                if (i == 1 || j == 1 || i == n || j == m) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}

