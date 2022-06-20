package Patterns;

import java.util.Scanner;

/*
 * 12345
 * 1234
 * 123
 * 12
 * 1
 * */
public class DownNumberTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provide number to make a number triangle: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
