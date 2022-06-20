package youtubeJavaPractice;

public class CastingInJava {
    public static void main(String[] args) {
        //casting
        double price = 100.00;
        double finalPrice = price + 18; //implicit casting
        //trying to store int (4 bytes) in double (8 bytes)
        //(java allowed this and automatically convert)
        System.out.println(finalPrice);

        int p = 100;
        int fp = (p) + (int) 18.0; // explicit casting
        //trying to store double (8 byte) in int(4 byte) datatype (java not allowed)
        System.out.println(fp);

    }
}
