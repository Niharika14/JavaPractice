package progampractice.arrays;

import java.util.HashMap;
import java.util.Map;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (Integer number : nums) {

            if (!map.containsKey(number)) {
                map.put(number, 1);
            } else {
                map.put(number, map.get(number) + 1);
            }
        }

        for (Map.Entry<Integer,Integer> duplicate : map.entrySet()) {
            /*int key = duplicate.getKey();
            int value = duplicate.getValue();
            if(value==1){
                return key;
            }*/

            if(duplicate.getValue().equals(1)){
                int key = duplicate.getKey();
                return key;
            }
        }
    return -1;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
