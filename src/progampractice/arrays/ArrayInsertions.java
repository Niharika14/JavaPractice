package progampractice.arrays;

import java.util.Arrays;

public class ArrayInsertions {

    static int j = 0;

    public static int[] startPosition(int[] num, int val) {
        System.out.println("Before Adding "+val*2+" at Starting Position: " + Arrays.toString(num));
        for (int i = num.length - 1; i > 0; i--) {
            num[i] = num[i - 1];
        }
        num[0] = val * 2;
        return num;
    }

    public static int[] endPosition(int[] num, int val) {
        System.out.println("Before Adding "+val+" at End Position: " + Arrays.toString(num));
        num[j++] = val;
        return num;
    }

    public static int[] midPosition(int[] num, int val, int index) {
        System.out.println("Before Adding "+val*3+" at Mid Position: " + Arrays.toString(num));
        for (int i = num.length - 1; i > index; i--) {
            num[i] = num[i - 1];
        }
        num[index] = val * 3;

        return num;
    }

    public static void main(String[] args) {
        int[] num = new int[10];
        int val = 10;
        int index = 2;

        for (int i = 0; i < 6; i++) {
            num[j++] = i*2+1;
        }

        int[] endPointResult = endPosition(num, val);
        System.out.println(Arrays.toString(endPointResult));

        int[] startPointResult = startPosition(num, val);
        System.out.println(Arrays.toString(startPointResult));

        int[] midPointResult = midPosition(num, val, index);
        System.out.println(Arrays.toString(midPointResult));
    }
}
