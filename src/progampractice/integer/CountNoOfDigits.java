package progampractice.integer;

public class CountNoOfDigits {

    public static int countDigits(int num){
        int rem;
        int count =0;
        while(num>0){
            rem = num%10;
            count++;
            num = num/10;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countDigits(124033));
    }
}
