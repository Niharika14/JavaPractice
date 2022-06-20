package w3resource.basicexercisepart.part1;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProblemsOfPart1 solutions = new ProblemsOfPart1();

        /*//Solution1
        System.out.print("Please enter your name: ");
        String output = solutions.printName(sc.next());
        System.out.println(output);

        //Solution2
        System.out.print("Please Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Please Enter your second number: ");
        int b = sc.nextInt();
        int sumOfTwoNumber = solutions.sumOfTwoNumbers(a,b);
        System.out.println("Sum of "+a+" and "+b+" is: "+sumOfTwoNumber);

        //Solution3
        System.out.print("Please Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Please Enter your second number: ");
        int b = sc.nextInt();
        int sumOfTwoNumber = solutions.divisionOfTwoNumbers(a,b);
        System.out.println("Division of "+a+" and "+b+" is: "+sumOfTwoNumber);

        //Solution4
        System.out.print("Please Enter your operation (+,-,*,/,%): ");
        String operation = sc.next();
        System.out.print("Please Enter your first number: ");
        int a = sc.nextInt();
        System.out.print("Please Enter your second number: ");
        int b = sc.nextInt();
        int sol4 = solutions.performOperations(operation,a,b);
        System.out.println(sol4);

        //Solution5
        System.out.print("Please Enter your Number: ");
        solutions.tableOfXNumber(sc.nextInt());

        //Solution6
        solutions.patternPrint();*/

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int start =0;
        int end = arr.length-1;
        int sum =0;
        int target = 7;
        while(start<end){
            sum = arr[start]+arr[end];
            if(sum == target){
                System.out.println(arr[start]+" ::: "+arr[end]);
            }
            if(sum>target){
                end--;
            }
            else {
                start++;
            }
        }

    }
}
