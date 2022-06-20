package progampractice.integer;

public class PrimeNumber {

    public static boolean isPrime(int num){
        int count=0;
        if(num>1) {
            for (int i=1 ; i <= num; i++){
                if(num%i == 0){
                    count++;
                }
            }
        }
        if(count == 2 || num == 1){
            return true;
        }
        else
        {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isPrime(1));
        System.out.println(isPrime(2));
        System.out.println(isPrime(4));
        System.out.println(isPrime(3));
        System.out.println(isPrime(5));
        System.out.println(isPrime(11));
        System.out.println(isPrime(17));
        System.out.println(isPrime(121));



    }
}
