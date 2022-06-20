package progampractice.integer;

public class Reverse {

    public static int ReverseDigit(int num) {
        int result = 0;
        int reminder;
        int prev = 0;
        while (num != 0) {
            reminder = num % 10;
            result = reminder + result * 10;
            num = num / 10;
            if ((result - reminder) / 10 != prev)
                return 0;
            prev = result;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(ReverseDigit(120));
        System.out.println(ReverseDigit(-123));
        System.out.println(ReverseDigit(-2147483412));
    }
}
