package leetcode.string;

public class MinTimeToType {
    public static int minTimeToType(String word) {
        int time = 0;
        for(int i = 0;i<word.length();i++){
            System.out.println(word.charAt(i));
            if(word.charAt(i)=='a'){
                time = time+1;
            }
            else{

            }
        }
        return time;
    }

    public static void main(String[] args) {
        String word = "abc";
        int count = minTimeToType(word);
        System.out.println(count);
    }
}
