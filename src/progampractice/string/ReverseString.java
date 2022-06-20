package progampractice.string;

import java.util.Scanner;

public class ReverseString {

    public static String reverseStringUsingCharArray(String sample) {

        char[] charArray = sample.toCharArray();
        int start = 0;
        int end = sample.length() - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(charArray);
    }

    public static StringBuffer reverseStringUsingStringBuffer(String sample) {

        StringBuffer str = new StringBuffer(sample);
        System.out.println(str.reverse());
        return str.reverse();

    }

    public static StringBuilder reverseStringUsingStringBuilder(String sample) {

        StringBuilder str = new StringBuilder(sample);
        return str.reverse();
    }


    public static void main(String[] args) {

        System.out.println(reverseStringUsingCharArray("hello"));
        System.out.println(reverseStringUsingStringBuffer("testing"));
        System.out.println(reverseStringUsingStringBuilder("123testing12"));
    }

}
