package youtubeJavaPractice;

public class operatorsInJava {
    public static void main(String[] args) {
        //operator
        int a = 4;
        int b = 3;
        int adding = a + b;
        int sub = b - a;
        int mul = a * b;
        int div = a / b;
        System.out.println("add: " + adding);
        System.out.println("sub: " + sub);
        System.out.println("mul: " + mul);
        System.out.println("div: " + div);

        double c = 5;
        double d = 3;
        double modulo = a % b;
        System.out.println("Modulo " + modulo);

        //
        int num = 1;
        num = num + 1;
        System.out.println("Num " + num);
        System.out.println("Num post increment " + num++);
        System.out.println("Num pre increment " + ++num);

        int num1 = 3;
        num1 = num1 - 1;
        System.out.println("Num " + num1);
        System.out.println("Num post decrement " + num1--);
        System.out.println("Num pre decrement " + --num1);
    }
}
