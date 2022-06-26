package progampractice.interviewprepration;

public class ReverseNumber {
    public static void reverseNumber(int num) {
        int revNum = 0;
        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            revNum = revNum * 10 + rem;
        }
        System.out.println("reverse Number of given number is " + revNum);
    }

    public static void main(String[] args) {

        int num = 12343;
        reverseNumber(num);
        reverseNumber(21);
        reverseNumber(1);
        reverseNumber(43535);
    }
}
