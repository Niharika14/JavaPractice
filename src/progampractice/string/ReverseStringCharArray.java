package progampractice.string;

public class ReverseStringCharArray {

    public static void reverseString(char[] s) {
            int start =0;
            int end = s.length-1;
            while(start<end){
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;
            }

        for(char item:s){
            System.out.print(item);
        }
    }

    public static void main(String[] args) {
        char[] arr = {'h','e','l','l','o'};

       reverseString(arr);
    }
}
