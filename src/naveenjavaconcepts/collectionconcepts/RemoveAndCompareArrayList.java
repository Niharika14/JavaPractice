package naveenjavaconcepts.collectionconcepts;

import java.util.*;
import java.util.stream.Collectors;

public class RemoveAndCompareArrayList {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1,2,4,5,9,7,4,2,1,3,4,5,6,7,8,9,19,3,21,23,19,23,22));
        System.out.println(arr);
        
        //Using LinkedHashSet
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>(arr);
        System.out.println(linkedHashSet);
        ArrayList<Integer> arrWoDup = new ArrayList<>(linkedHashSet);
        System.out.println(arrWoDup);
        
        //Using stream
        ArrayList<Integer> arr1 = new ArrayList<>(Arrays.asList(23,3,1,3,435,656,43,1,2,4,5,9,7,4,2,1,3,4,5,6,7,8,9,19,3,21,23,19,23,22));
        List<Integer> collect = arr1.stream().distinct().collect(Collectors.toList());
        System.out.println(collect);

        //Compare 2 ArrayList
        ArrayList<String> lang = new ArrayList<>(Arrays.asList("Java","Python", "Ruby", "C#", "VSS","Visual"));
        ArrayList<String> lang1 = new ArrayList<>(Arrays.asList("Java","Python", "Ruby", "C#", "VSS","Visual"));
        ArrayList<String> lang2 = new ArrayList<>(Arrays.asList("Sql","Java","Python", "Ruby", "C#", "VSS","Visual"));
        ArrayList<String> lang3 = new ArrayList<>(Arrays.asList("Sql","Java","Python", "Oracle" ,"Ruby", "C#", "VSS","Visual"));

        //Sort and compare
        Collections.sort(lang);
        System.out.println(lang);
        Collections.sort(lang1);
        System.out.println(lang1);
        System.out.println(lang.equals(lang1));
        System.out.println(lang.equals(lang2));

        //find additional Element
        lang2.removeAll(lang1);
        System.out.println(lang2);

        //find Missing Element
        lang3.removeAll(lang1);
        System.out.println(lang3);

        //Common Elements
        lang3.retainAll(lang2);
        System.out.println(lang3);


    }
}
