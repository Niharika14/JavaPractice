package progampractice.interviewprepration;

import java.util.Arrays;

public class ReverseString {

    public static String reverseString(String str) {
        char[] chars = str.toCharArray();

        int start = 0;
        int end = chars.length - 1;

        System.out.println(Arrays.toString(chars));

        while (start < end) {
            char ch = chars[start];
            chars[start] = chars[end];
            chars[end] = ch;
            start++;
            end--;
        }


        return String.valueOf(chars);

    }

    public static void main(String[] args) {

        String str = "Niharika";
        System.out.println(reverseString(str));

    }
}
