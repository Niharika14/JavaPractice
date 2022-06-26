package progampractice.interviewprepration;

public class PalindromeString {
    public static void palindromeString(String str) {

        char[] ch = str.toLowerCase().toCharArray();
        int start = 0;
        int end = str.length() - 1;
        boolean flag = true;
        while (start < end) {
            if (ch[start] != ch[end]) {
                flag = false;
                break;
            } else {
                start++;
                end--;
            }
        }

        if (flag == true) {
            System.out.println(str+" - String is palindrome");
        } else {
            System.out.println(str+" - String is not palindrome");
        }
    }

    public static void main(String[] args) {

        String str = "deified";
        palindromeString(str);
        palindromeString("deed");
        palindromeString("w8o8w");
        palindromeString("wo8w");
    }
}
