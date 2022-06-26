package progampractice.interviewprepration;

public class DigitCount {
    public static void digitCount(int num) {

        int count = 0;
        while (num > 0) {
            num = num / 10;
            count++;
        }
        System.out.println("No of digit in given number is "+count);
    }

    public static void main(String[] args) {

        int num = 1234;
        digitCount(num);
        digitCount(24);
        digitCount(432432424);
        digitCount(4);

    }
}
