package progampractice.integer;

public class SwapNumber {

    public static void SwapNumbersWithoutTemp(int a, int b){
        a= a+b;//10+20
        b=a-b;//30-20
        a=a-b;//30-10

        System.out.println(a+":"+b);

        a=a*b;
        b=a/b;
        a=a/b;
        System.out.println(a+":"+b);
    }

    public static void main(String[] args) {
        SwapNumbersWithoutTemp(10,20);
    }
}
