package youtubeJavaPractice;

public class BreakAndContinueInJava {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println(i);
            i++;

            if (i == 3) {
                System.out.println("Need to skip " + i);
                i++;
                continue;
            }

            if (i > 5) {
                break;
            }
        }
    }
}
