package progampractice.interviewprepration;

import java.util.HashMap;
import java.util.Map;

public class DuplicateWordAndCount {

    public static void duplicateWords(String str){

        HashMap<String, Integer> map= new HashMap<>();
        String[] val = str.toLowerCase().split(" ");

        for(String s: val){
            if(!map.containsKey(s)){
                map.put(s,1);
            }
            else{
                map.put(s, map.get(s)+1);
            }
        }
        System.out.println("Duplicate Words and Count in " + str + " string");

        for(Map.Entry m: map.entrySet()){
            if(!m.getValue().equals(1)){
                System.out.println(m.getKey()+" "+m.getValue());
            }

        }
    }

    public static void main(String[] args){

        String str = "Big black bug bit a big black dog on his big black nose";
        duplicateWords(str);

    }
}
