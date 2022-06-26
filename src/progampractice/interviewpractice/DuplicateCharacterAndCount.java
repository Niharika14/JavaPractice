package progampractice.interviewpractice;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterAndCount {
    public static void duplicateChars(String str) {

        HashMap<Character, Integer> map = new HashMap<>();

        char[] ch = str.toLowerCase().toCharArray();
        for (char c : ch) {
            if (!map.containsKey(c)) {
                map.put(c, 1);
            } else {
                map.put(c, map.get(c) + 1);
            }
        }

        System.out.println("Duplicate Character and Count in " + str + " string");
        for (Map.Entry c : map.entrySet()) {
            if (!c.getValue().equals(1)) {
                System.out.println(c.getKey() + " " + c.getValue());
            }
        }
    }

    public static void main(String[] args) {

        String str = "Niharika";
        duplicateChars(str);

    }
}
