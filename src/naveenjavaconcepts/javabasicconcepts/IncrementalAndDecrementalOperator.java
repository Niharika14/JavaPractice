package naveenJavaConcepts.javaBasicConcepts;

public class IncrementalAndDecrementalOperator {
    public static void main(String[] args) {
        // 1. post incremental

        int a=1;
        System.out.println("a: "+a);

        int b=a++;
        System.out.println("a after increment: "+a);
        System.out.println("b: "+b);

        int x=1;
        System.out.println("x: "+x);

        int y=++x;
        System.out.println("x after increment: "+x);
        System.out.println("y: "+y);


    }
}
