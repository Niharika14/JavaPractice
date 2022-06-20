
package progampractice.string;

import java.util.Arrays;

public class ReverseStringWithoutSpecialChar {

    public static void main(String[] args) {
        String str = "a-bC-dEf-ghIj";
        char[] ch = str.toCharArray();
        int start =0;
        int end = ch.length-1;

        while (start<end){
            if(Character.isLetter(ch[end]) && Character.isLetter(ch[start])){
                char temp = ch[start];
                ch[start]= ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
            else if (!Character.isLetter(ch[end])){
                end--;
            }
            else if(!Character.isLetter(ch[start])){
                start++;
            }
        }
        System.out.println(Arrays.toString(ch));
    }
}
