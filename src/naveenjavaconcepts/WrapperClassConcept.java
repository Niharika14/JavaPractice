package naveenjavaconcepts;

public class WrapperClassConcept {
    public static void main(String[] args) {
        String x= "1000";
        int i = Integer.parseInt(x);
        System.out.println(i);

        System.out.println(Integer.max(10,20));
        System.out.println(Integer.MIN_VALUE +" "+Integer.MAX_VALUE);
        System.out.println(Integer.bitCount(i));
        System.out.println(Integer.getInteger(x));
        System.out.println(Integer.reverse(i));
    }

}
