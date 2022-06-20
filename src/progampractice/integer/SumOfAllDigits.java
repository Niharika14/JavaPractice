package progampractice.integer;

public class SumOfAllDigits {

    public static int sumOFDigits(int num){
        int reminder;
        int sum = 0;
        while(num >0){
            reminder = num%10;
            sum += reminder;
            num /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOFDigits(100));
        System.out.println(sumOFDigits(132));
        System.out.println(sumOFDigits(765));
    }
}
