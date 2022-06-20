package progampractice.integer;

public class ArmstrongNumber {

    public static boolean isNumberArmstrong(int num) {
        int reminder;
        int sum = 0;
        int amNum = num;
        while (num > 0) {
            reminder = num % 10;
            sum += reminder*reminder*reminder;
            num /= 10;
        }
        if(sum == amNum){
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isNumberArmstrong(100));
        System.out.println(isNumberArmstrong(153));
        System.out.println(isNumberArmstrong(271));
        System.out.println(isNumberArmstrong(371));
    }
}
