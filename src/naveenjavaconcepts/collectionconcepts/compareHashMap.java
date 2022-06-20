package naveenjavaconcepts.collectionconcepts;

import com.sun.crypto.provider.HmacPKCS12PBESHA1;

import javax.naming.PartialResultException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class compareHashMap {
    public static void main(String[] args) {
        HashMap<Integer, String> map1 = new HashMap<>();
        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3,"C");

        HashMap<Integer, String> map2 = new HashMap<>();
        map2.put(1,"A");
        map2.put(2,"B");
        map2.put(3,"C");

        HashMap<Integer, String> map3 = new HashMap<>();
        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3,"C");
        map3.put(3,"D");

        HashMap<Integer, String> map4 = new HashMap<>();
        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(3,"C");
        map4.put(4,"D");

        HashMap<Integer, String> map5 = new HashMap<>();
        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3,"C");
        map5.put(4,"C");

        //Use Equal Methods
        System.out.println(map1.equals(map2));
        System.out.println(map1.equals(map3));
        System.out.println(map1.equals(map4));

        //Compare Hashmap & same key
        System.out.println(map1.keySet().equals(map2.keySet()));
        System.out.println(map1.keySet().equals(map3.keySet()));
        System.out.println(map1.keySet().equals(map4.keySet()));

        //Findout Extra
        HashSet<Integer> combineKey = new HashSet<>(map1.keySet());
        System.out.println(combineKey);
        combineKey.addAll(map4.keySet());
        System.out.println(combineKey);
        combineKey.removeAll(map1.keySet());
        System.out.println(combineKey);

        //Compare by Values : Duplicated are not allowed
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map2.values())));
        System.out.println(new ArrayList<>(map1.values()));
        System.out.println(new ArrayList<>(map5.values()));
        System.out.println(new ArrayList<>(map1.values()).equals(new ArrayList<>(map5.values())));

        //Compare by Values : Duplicated not allowed
        System.out.println(new HashSet<>(map1.values()));
        System.out.println(new HashSet<>(map5.values()));
        System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map2.values())));
        System.out.println(new HashSet<>(map1.values()).equals(new HashSet<>(map5.values())));


    }
}
