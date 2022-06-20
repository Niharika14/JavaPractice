package apnacollegeconcepts.patterns;

import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please provide number to make a number triangle: ");
        int n = sc.nextInt();

        //Upper Half
        for(int i =1;i<=n;i++){
            //space
            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }

            //Star
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");
        }

        //LowerHalf
        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for(int j=1; j<=2*i-1; j++){
                System.out.print("*");
            }
            System.out.println("");

        }
    }

}
