package progampractice.integer;

public class FibonacciNumber {
    static void FibonacciSeries(int num) {
        int first = 0;
        int second = 1;
        int sum = 0;
        System.out.print(first + " " + second);
        for (int i = 2; i < num; i++) {
            sum = first + second;
            System.out.print(" " + sum);
            first = second;
            second = sum;
        }

    }

    public static void main(String[] args) {
        FibonacciSeries(8);
    }
}
