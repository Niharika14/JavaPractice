package progampractice.array;

import java.util.HashMap;

/*
 * Write a program to remove duplicates from An UnSorted array in Java?
 */
public class FindDuplicateUnsorted {


    public static void main(String[] args) {
        int[] num = {3, 1, 2, 5, 3, 4, 3,5,4,6,7,8,5,6};

        //Case1
        /*int count=0;
        Arrays.sort(num);
        System.out.println(Arrays.toString(num));
        for(int i = 0; i < num.length-1;i++){
            if(num[i]!=num[i+1]){
                num[count++]=num[i];
            }
        }
        num[count++]=num[num.length-1];
        System.out.println(Arrays.toString(num));
*/
        //Case2
        /*HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < num.length; i++) {
            if (map.get(num[i]) == null) {
                map.put(num[i], 1);
            } else {
                map.put(num[i], map.get(num[i]) + 1);
            }
        }
        System.out.println(map);


        List<Integer> arr = new ArrayList<>(map.keySet());
        for (Integer i : arr) {
            System.out.println(i);
        }*/

        /*int i=0;
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()){
            int key = it.next();
            int value = map.get(key);
            num[i++]=key;
            System.out.println(key+":::"+value);
        }



        for(int j =0;j< num.length-1;j++){
            System.out.print(num[j]);
        }
*/

        //Case3
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int arr : num) {
            if (!map.containsKey(arr)) {
                map.put(arr, 1);
            } else {
                map.put(arr, map.get(arr) + 1);
            }
        }
        System.out.println(map);

        for(Integer x :map.keySet()){
            //System.out.println(x);
            if(map.get(x)>1){
                System.out.println(x);
            }
        }
    }
}
