package progampractice.interviewprepration;

public class PrimeNumber {

    public static void primeNumber(int num) {
        boolean flag = true;
        if (num == 0 && num == 1) {
            flag = true;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println("Given number is not prime " + num);
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("Given number is prime " + num);
        }
    }

    public static void main(String[] args) {

        int num = 312;
        primeNumber(num);
        primeNumber(4);
        primeNumber(5);
        primeNumber(11);
        primeNumber(1);
        primeNumber(2);

    }
}
