package progampractice;

public class testing {

    public static void main(String[] args) {
        int[] num = {12, 345, 4535, 132, 3454564, 56, 5464};
        int evenCount = 0;

        for(int n: num){
            int digitCount = String.valueOf(n).length();
            if(digitCount%2==0){
                evenCount++;
            }
        }

        System.out.println(evenCount);
    }
}


