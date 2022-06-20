package w3resource.basicexercisepart.part1;

public class ProblemsOfPart1 {

    /*
    1. Write a Java program to print 'Hello' on screen and then print your name on a separate line.*/
    public String printName(String name){
        return "Hello "+name;
    }

    /*
    2. Write a Java program to print the sum of two numbers.*/
    public int sumOfTwoNumbers(int a, int b){
        return a+b;
    }

    /*
    3. Write a Java program to divide two numbers and print on the screen.*/
    public int divisionOfTwoNumbers(int a, int b){
        return a/b;
    }

    /*
    4. Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers*/

    public int performOperations(String operator, int a, int b){
        int result = 0;
        switch (operator){
            case "+": result = a+b; break;
            case "-": result = a-b; break;
            case "*": result = a*b; break;
            case "/": result = a/b; break;
            case "%": result = a%b; break;
        }
        return result;
    }

    /*
    5.  Write a Java program that takes a number as input and prints its multiplication table upto 10. */
    public void tableOfXNumber(int a){
        for (int i=1; i<=10; i++){
            System.out.println(a+" x "+i+" = "+a*i);
        }
    }

    /*
    6. Write a Java program to display the following pattern
                   J    a   v     v  a
                   J   a a   v   v  a a
                J  J  aaaaa   V V  aaaaa
                 JJ  a     a   V  a     a
    */
    public void patternPrint(){
        System.out.println("   J    a   v     v  a");
        System.out.println("   J   a a   v   v  a a");
        System.out.println("J  J  aaaaa   V V  aaaaa");
        System.out.println(" JJ  a     a   V  a     a");
    }

    /*
    7. Write a Java program to print the area and perimeter of a circle.*/
    /*public void circleOperation(int operation,int radius){
        float result = 0;
        switch (operation){
            case "1":
                result = Math.PI*(radius*radius);
                break;
        }

    }*/


}
