package youtubeJavaPractice;

public class LoopsInJava {
    public static void main(String[] args) {
        //LoopsInJava

        for (int i = 1; i <= 10; i++) {
            System.out.println("------");
            System.out.println(i);
        }

        for (int i = 1; i <= 100; i = i + 10) {
            System.out.println("------");
            System.out.println(i);
        }

        for (int i = 10; i >= 1; i--) {
            System.out.println("------");
            System.out.println(i);
        }

        //while loop
        int i = 10;
        while (i >= 1) {
            System.out.println(i);
            i--;
        }

        //Do While Loop
        int k = 10;
        do {
            System.out.println(k);
            k--;
        } while (k >= 1);
    }
}
