package apnacollegeconcepts.patterns;

import java.util.Scanner;

public class NumberPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter value for n: ");
        int n = sc.nextInt();

        for(int i =1;i<=n;i++){
            //for space
            for(int j =1; j<=n-i;j++){
                System.out.print(" ");
            }

            //for Number
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println("");
        }
    }
}
