package naveenjavaconcepts.stringconcepts;

public class StringbufferConcept {

    public static void main(String[] args) {
        String s = new String("niharika");
        s.concat("123");
        System.out.println(s);

        s= s.concat("123");
        System.out.println(s);

        StringBuffer sb = new StringBuffer("niharika");
        sb.append("1233");
        System.out.println(sb);

        System.out.println("---------------------");
        String s1= new String("durga");
        String s2 =new String("durga");
        System.out.println(s1==s2);
        System.out.println(s1.equals(s2));

        StringBuffer sb1= new StringBuffer("Durga");
        StringBuffer sb2 =new StringBuffer("Durga");
        System.out.println(sb1==sb2);
        System.out.println(sb1.equals(sb2));
    }

}
