package naveenJavaConcepts.javaBasicConcepts;

public class StringConcatination {
    public static void main(String[] args) {

        String s="Hellow World!";
        String s1="Learning from Naveen Classes";

        System.out.println(s+" "+s1);

        int a=100;
        int b=200;

        //String Concat from Left to Right
        System.out.println(a+b+s+s1); //300Hellow World!Learning from Naveen Classes
        System.out.println(s+s1+a+b); //Hellow World!Learning from Naveen Classes100200

        System.out.println(s+s1+(a+b)); //Hellow World!Learning from Naveen Classes300

        System.out.println("the value of a is: "+a);
        System.out.println("the value of b is: "+b);
        System.out.println("sum is: " +a+b);

        char t1='a';
        char t2='b';
        char t3='z';
        char t4='1';
        System.out.println(t1+t2);
        System.out.println(t1);
        System.out.println((int)t1);
        System.out.println(t2+t3+t4);

        //a-z: 97 to 122
        //A-Z: 65 to 90
        //0-9: 48 to 57

        System.out.println(s+s1+t1);
        System.out.println(t1+t2+s+s1);

        //-----------------------------//

        System.out.println(10+20); //30
        System.out.println(20/10); //2
        //System.out.println(9/0); //Arithmetic Exception
        System.out.println(0/9); //0
        System.out.println(5/2); //2
        System.out.println(5.0/2); //2.5
        System.err.println(5/2.0); //2.5
        System.out.println(5.0/2.0); //2
        System.out.println(2.5/0); //Infinity
        System.out.println(2/0.0); //Infinity
        System.out.println(2.5/0.0);//Infinity
        //System.out.println(0/0); //Arithmetic Exception

        System.out.println(0.0/3);
        System.out.println(0/0.0); //NaN
        System.out.println(0.0/0.0); //NaN
        System.out.println(0.0/0); //NaN
        System.out.println();

    }
}
