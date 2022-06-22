package leetcode.string;

import java.util.ArrayList;
import java.util.List;

/*
Input:
items = [["phone","blue","pixel"],["computer","silver","lenovo"],["phone","gold","iphone"]], ruleKey = "color", ruleValue = "silver"
Output: 1
Explanation: There is only one item matching the given rule, which is ["computer","silver","lenovo"].
* */
public class CountMatches {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int index = -1;
        switch (ruleKey) {
            case "type":
                index = 0;
                break;
            case "color":
                index = 1;
                break;
            case "name":
                index = 2;
                break;
        }

        int count = 0;
        for (List<String> row : items) {
            if (row.get(index).equals(ruleValue)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        List<List<String>> listOfLists = new ArrayList<>();

//listOfLists = [{"phone","blue","pixel"},{"computer","silver"},{"lenovo","phone","gold","iphone"}];
        // Creating innerList
        List<String> innerList = new ArrayList<>();

        // Adding elements to innerList
        innerList.add("phone");
        innerList.add("blue");
        innerList.add("pixel");

        // Adding innerList to listOfLists
        listOfLists.add(innerList);

        // Creating another inner list
        List<String> innerList2 = new ArrayList<>();

        // Adding elements to innerList2
        innerList2.add("computer");
        innerList2.add("silver");
        innerList2.add("lenovo");

        // Adding innerList2 to listOfLists
        listOfLists.add(innerList2);

        String ruleKey = "color";
        String ruleValue = "silver";
        System.out.println(countMatches(listOfLists, ruleKey, ruleValue));
    }
}
