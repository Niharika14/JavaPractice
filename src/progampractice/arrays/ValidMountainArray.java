package progampractice.arrays;

public class ValidMountainArray {

    public static boolean validMountainArray(int[] arr) {

        if (arr.length < 3) return false;

        int i = 0;
        for (; i < arr.length-1; i++) {
            if (arr[i] > arr[i + 1]) {
                i++;
                break;
            } else if (arr[i] == arr[i + 1]) {
                return false;
            }
        }
        System.out.println(i);
        if (i < 2) return false;
        for (; i < arr.length; i++) {
            if (arr[i - 1] <= arr[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(validMountainArray(new int[]{0, 3, 2, 1}));
        System.out.println(validMountainArray(new int[]{4, 3, 2, 1}));
        System.out.println(validMountainArray(new int[]{0,1,2,3,4,5,6,7,8,9}));
    }

}
