package naveenJavaConcepts.javaBasicConcepts;

public class DataTypes {

    //this is my first java code
    public static void main(String[] args) {
        /*data types: type of data is called data types.
         *Java is strict type:

         * 1. Primitive Data types: No need of object
         *boolean: T/F
         *Numeric:
         *Character: char
         *Integral:
         *Integer: byte, short, int, long
         *Float: float, double
         * 2. Non Primitives Data types: object will come into picture
         *String, Arrays, Class, Interface
         */


        /*
         * 1. byte:
         * range=-128 to 127
         * size= 1 byte = 8 bits
         */

        byte b = 10; 	//b is occupying 1 byte.
        // byte b = 10 this is not allowed because we already initialize
        b=30; 			// this is allowed because we are replacing value
        b=40;
        byte b1 = 20;
        //byte b2 = 200; // this is not allowed
        byte b3 = 0;
        byte b4 = -90;

        System.out.println("byte "+b);
        System.out.println("byte "+b+b1);
        //System.out.println("byte"+b2);
        System.out.println("byte "+b3);
        System.out.println("byte "+b4);


        /*
         * 2. Short:
         * range=-32768 to 32767
         * size= 2 byte = 16 bits
         */

        short s = 1000;
        short s1 = 1; //this one is using more memory we can also use byte for this.

        System.out.println("short "+s+s1);

        /*
         * 3. Int:
         * range=-2147483648 to 2147483647
         * size= 4 byte = 32 bits
         */

        int i=17;
        int totalBill=1200000;

        System.out.println("int "+i+totalBill);

        /*
         * 4. Long:
         * range=-2^64-1 to 2^64
         * size= 8 bytes = 64 bits
         */

        long l = 22222222222222l;
        System.out.println("long "+l);

        long population = 121212121212l;
        //Total no of booking, Population, Covid Cases, distance between moon earth, total no of users.

        System.out.println("long "+population);

        // SSN, Credit Card Number, Phone Number, Fax Number have to store in INT. We don't need to do any calculation.


        /*
         * 5. Float:
         * range=after point , it can take upto 7 digits
         * size= 4 bytes = 32 bits
         */
        float f = 12.33f;
        System.out.println("float "+f);

        float f1=(float)13.44;
        System.out.println("float "+f1);

        /*
         * 6. Double:
         * range=after point , it can take upto 15 digits
         * size= 8 bytes = 64 bits
         */
        double d = 12.333333;
        System.out.println("double "+d); // Value of pi

        double d1=100;
        System.out.println("duble "+d1);


        /*
         * 7. char: Only single digit value
         * size= 2 bytes = 16 bits
         */

        char c='a';
        char c1='1';
        char c2='$';
        char c3='h';
        //char c3='11'; // only single digit value
        System.out.println("char "+c);
        System.out.println("char "+c1);
        System.out.println("char "+c2);
        System.out.println("char "+c3);
        System.out.println("char"+c+c1+c2+c3);

        //Example: gender, flag(Y/N)


        /*
         * 8. boolean:
         * size= ~ 1 bit
         */

        boolean flg= true;
        boolean fl = false;

        System.out.println("Boolean "+flg);
        System.out.println("Boolean "+fl);



    }

}


//Java Virtual Machine is responsible to run my code
