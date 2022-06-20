package progampractice.integer;

public class Palindrome {

    public static boolean isPalindrome(int num){
        int palNum = num;
        int rev =0;

        while(num>0){
            int rem = num%10;
            rev = rem + rev*10;
            num = num/10;
        }

        if(rev == palNum){
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        System.out.println(isPalindrome(321223));
        System.out.println(isPalindrome(21223));
        System.out.println(isPalindrome(32223));
        System.out.println(isPalindrome(5421245));
    }
}
