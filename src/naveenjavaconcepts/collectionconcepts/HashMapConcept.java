package naveenjavaconcepts.collectionconcepts;

import java.util.*;

public class HashMapConcept {
    public static void main(String[] args) {
        /*HashMap<String, String> countryList = new HashMap<>();
        countryList.put("India", "New Delhi");
        countryList.put("UK", "London");
        countryList.put("USA", "Washington DC");
        countryList.put(null, "LA");
        countryList.put(null, "LV");
        countryList.put("Russia", null);
        countryList.put("China", null);
        System.out.println(countryList);

        System.out.println(countryList.get(null));
        System.out.println(countryList.get("Russia"));

        countryList.remove(null);
        System.out.println(countryList);

        for(Map.Entry ite : countryList.entrySet()){
            System.out.println(ite.getKey()+" : "+ite.getValue());

        }
*/
        //Conversion of HashMap into ArrayList
        HashMap<String, Integer> comInfo = new HashMap<>();
        comInfo.put("Google",10000);
        comInfo.put("Amazon",30000);
        comInfo.put("Cisco",1000);
        comInfo.put("Paytm",12000);

        for(Map.Entry it: comInfo.entrySet()){
            System.out.println(it.getKey()+"::"+it.getValue());
        }

        //comInfo.forEach((k,v) -> System.out.println(k+"--"+v));

        List<String> comName = new ArrayList<>(comInfo.keySet());
        for(String name: comName){
            System.out.println(name);
        }

        List<Integer> comVal = new ArrayList<>(comInfo.values());
        for(Integer value: comVal){
            System.out.println(value);
        }
        /*//Iterator using keyset()
        Iterator<String> it = countryList.keySet().iterator();
        while (it.hasNext()) {
            String key = it.next();
            String value = countryList.get(key);
            System.out.println("Key:" + key + " and Value:" + value);
        }

        //Iterator using entryset()
        Iterator<Map.Entry<String, String>> it1 = countryList.entrySet().iterator();

        while (it1.hasNext()) {
            Map.Entry<String, String> entry = it1.next();
            System.out.println(entry.getKey()+" :: "+entry.getValue());
        }

        //Iterate Using Java 8 each & lambda
        countryList.forEach((key,value) -> System.out.println("Key:" + key + " and Value:" + value));*/
    }
}
