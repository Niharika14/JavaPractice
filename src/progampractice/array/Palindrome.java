package progampractice.array;

public class Palindrome {

    public static Boolean palindromeString(String s) {

        String newString="";
        for(char c: s.toCharArray()){
            if(Character.isDigit(c) || Character.isLetter(c)){
                newString+=c;
            }
        }

        char[] charArray = newString.toLowerCase().replace(" ","").toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            if (charArray[start] != charArray[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static Boolean isPalindrome(String s){

        char[] c = s.toLowerCase().replace(" ","").toCharArray();
        int start =0;
        int end = c.length-1;

        while(start<end){
            if(c[start] != c[end]){
                return false;
            }
            start++;
            end--;
        }

        return true;
    }

    public static void main(String[] args) {
       // String str = "Madam";
        System.out.println(isPalindrome("Madam"));
        System.out.println(palindromeString("A man, A plan, A Canal: Panama"));
        System.out.println(palindromeString("A man, A plan, A C87678Canal: Panama"));
    }
}
