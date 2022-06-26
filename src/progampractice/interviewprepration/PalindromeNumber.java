package progampractice.interviewprepration;

public class PalindromeNumber {
    public static void palindromeNumber(int num) {

        int revNum = 0;
        int original = num;

        while (num > 0) {
            int rem = num % 10;
            num = num / 10;
            revNum = revNum * 10 + rem;
        }
        if (revNum == original) {
            System.out.println(original + " - number is palindrome Number");
        } else {
            System.out.println(original + " - number is not palindrome Number");
        }
    }

    public static void main(String[] args) {

        int num = 1234321;
        palindromeNumber(num);
        palindromeNumber(123);
        palindromeNumber(4325234);
        palindromeNumber(65);
    }
}
