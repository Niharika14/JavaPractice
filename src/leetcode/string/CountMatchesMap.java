package leetcode.string;

import java.util.Arrays;
import java.util.List;

/*
Input:
items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
* */
public class CountMatchesMap {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int flag = -1;
        switch (ruleKey) {
            case "product":
                flag = 0;
                break;
            case "color":
                flag = 1;
                break;
            case "brand":
                flag = 2;
                break;
        }

        int count = 0;
        for (List<String> check : items) {
            if (check.get(flag).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "silver", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(listOfLists, ruleKey, ruleValue));
    }
}
