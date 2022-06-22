package progampractice.arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] num = {1, 2, 3, 4, 5, 6, 7, 8};
        int search = 76;
        int start = 0;
        int end = num.length - 1;
        boolean flag = false;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (search == num[mid]) {
                flag = true;
                break;
            } else if (search < num[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        if(flag == true){
            System.out.println("Element found");
        }
        else {
            System.out.println("Element not found");
        }
    }

}
