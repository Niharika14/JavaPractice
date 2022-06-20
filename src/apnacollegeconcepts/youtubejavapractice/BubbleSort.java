package apnacollegeconcepts.youtubejavapractice;

public class BubbleSort {
    public static void printArray(int arr[]) {
        for (int e : arr) {
            System.out.print(e+" ");
        }
    }

    public static void main(String[] args) {
        int arr[] = {3, 5, 1, 4, 2, 3};

        //loop
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        printArray(arr);
    }
}
