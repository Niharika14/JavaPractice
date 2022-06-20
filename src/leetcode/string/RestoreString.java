package leetcode.string;

/*
Input: s = "codeleet", indices = [4,5,6,7,0,2,1,3]
Output: "leetcode"
Explanation: As shown, "codeleet" becomes "leetcode" after shuffling.

*/
public class RestoreString {
    public static String restoreString(String s, int[] indices) {
        char[] ch = new char[indices.length];
            for(int i =0; i<s.length(); i++) {
                ch[indices[i]] = s.charAt(i);
            }
   return String.valueOf(ch);
    }

    public static void main(String[] args) {
        String s = "abc";
        int[] indices = {0,1,2};
        System.out.println(restoreString(s,indices));
    }
}

