package leetcode.string;
import static java.lang.System.*;

/*
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
* */
public class SortSentence {
    public static String sortSentence(String s) {
        String[] sec = s.split(" ");
        String[] result = new String[sec.length];
        for(String word : sec){
            System.out.println("word: "+word);
            System.out.println("last digit: "+word.charAt(word.length()-1));
            System.out.println(word.charAt(word.length()-1)-'1');
            //result[word.charAt(word.length()-1)-'1'] = word.substring(0,word.length()-1);
        }
        return String.join(" ",result);
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        out.println(sortSentence(s));
    }
}
