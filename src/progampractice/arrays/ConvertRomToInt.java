package progampractice.arrays;

import java.util.HashMap;

public class ConvertRomToInt {
    public static void main(String[] args) {

        String rom = "CMXCVIII";
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] c = rom.toCharArray();
        int res = 0;
        for (int i = 0; i < c.length-1; i++) {
            if ((map.get(c[i + 1]) > map.get(c[i]))) {
                res -= map.get(c[i]);
            } else {
                res += map.get(c[i]);
            }
            System.out.println(res);
        }
        System.out.println(res+map.get(c[c.length-1]));
    }
}
