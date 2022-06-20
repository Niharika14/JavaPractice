package naveenjavaconcepts;

public class Parsing {
    public static void main(String[] args) {
        String x = "100";
        System.out.println(x+10);

        int i =Integer.parseInt(x);
        System.out.println(i+20);

        String y ="12.33";
        double j = Double.parseDouble(y);
        System.out.println(j+20);

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Byte.MIN_VALUE);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);

        System.out.println(Integer.max(10,20));
        int t=100;
        System.out.println(String.valueOf(t+20));

        boolean flag = true;
        System.out.println(flag);
        System.out.println(String.valueOf(flag));

    }
}
