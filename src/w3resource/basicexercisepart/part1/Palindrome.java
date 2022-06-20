package w3resource.basicexercisepart.part1;

public class Palindrome {
    public static void main(String[] args) {
        String pan = "racecar";
        int start =0;
        int end = pan.length()-1;
        boolean flag = false;
        while (start< end){
            if(pan.charAt(start)!=pan.charAt(end)){
                break;
            }
            else {
                start++;
                end--;
                flag=true;
            }
        }
        System.out.println(flag);
    }
}
