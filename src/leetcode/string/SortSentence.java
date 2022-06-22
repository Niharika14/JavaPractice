package leetcode.string;

import java.util.HashMap;

import static java.lang.System.out;

/*
Input: s = "is2 sentence4 This1 a3"
Output: "This is a sentence"
Explanation: Sort the words in s to their original positions "This1 is2 a3 sentence4", then remove the numbers.
* */
public class SortSentence {
    public static String sortSentence(String s) {
        String[] splitStr = s.split(" ");

        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < splitStr.length; i++) {
            int len = splitStr[i].length();
            int id = Character.getNumericValue(splitStr[i].charAt(len - 1));
            String val = splitStr[i].substring(0, len - 1);
            map.put(id, val);
        }
        StringBuilder strAns = new StringBuilder();
        for (int i = 0; i < map.size() + 1; i++) {
            if (map.containsKey(i)) {
                strAns.append(map.get(i) + " ");
            }
        }
        return strAns.toString().trim();
    }

    public static void main(String[] args) {
        String s = "is2 sentence4 This1 a3";
        out.println(sortSentence(s));
    }
}
