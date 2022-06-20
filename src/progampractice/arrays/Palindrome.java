package progampractice.arrays;

import java.util.Locale;

public class Palindrome {

    public static boolean isPalindrome(String str){

        char[] charArray = str.trim().toLowerCase().toCharArray();
        int start =0;
        int end = charArray.length-1;

        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            else
            {
                start++;
                end--;
            }
        }
        return true;
    }


    public static boolean isPalindromeWithSpace(String str){

        String newString="";
        for(char c: str.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                newString+=c;
            }
        }

        char[] charArray = newString.trim().toLowerCase().toCharArray();
        int start =0;
        int end = charArray.length-1;

        while(start<end){
            if(charArray[start]!=charArray[end]){
                return false;
            }
            else
            {
                start++;
                end--;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        // String str = "Madam";
        System.out.println(isPalindrome("21Madam12"));
        System.out.println(isPalindromeWithSpace("A man, A plan, A Canal: Panama"));
        System.out.println(isPalindromeWithSpace("A man, A plan, A C87678Canal: Panama"));
    }
}
