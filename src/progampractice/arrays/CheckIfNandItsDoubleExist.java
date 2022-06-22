package progampractice.arrays;

import java.util.HashMap;

public class CheckIfNandItsDoubleExist {

    public static boolean checkIfExist(int[] arr) {

        HashMap<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            System.out.println("map.containsKey((double)arr[i]*2) " + ((double) arr[i] * 2));
            System.out.println("map.containsKey((double)arr[i]/2) " + ((double) arr[i] / 2));
            if (map.containsKey((double) arr[i] * 2) || map.containsKey((double) arr[i] / 2)) {
                return true;
            }
            map.put((double) arr[i], i);
        }
        return false;
    }

    public static void main(String[] args) {
        int[] num = {10, 2, 5, 3};
        System.out.println(checkIfExist(num));
       /* System.out.println(checkIfExist(new int[]{7, 1, 14, 11}));
        System.out.println(checkIfExist(new int[]{3, 1, 7, 11}));
        System.out.println(checkIfExist(new int[]{-2, 0, 10, -19, 4, 6, -8}));*/
    }
}
