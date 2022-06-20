package youtubeJavaPractice;

import java.util.Locale;

public class NonPrimitivesType {
    public static void main(String[] args) {
        //Non - Primitive Types
        String name = "Aman";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        //For refrence type we will create using New Keywords
        //String name1 = new String(original: "Apu");

        //Concatenate
        String name1 = "Aman";
        String name2 = "Akku";
        String name3 = name1 + name2;
        System.out.println(name3);

        String name4 = name1 + " and " + name2;
        System.out.println(name4);

        //CharAt
        System.out.println(name.charAt(1));

        //Length
        System.out.println(name.length());

        //Replace
        String newName = (name.replace('a', 'b'));
        System.out.println(name);
        System.out.println(newName);

        //SubString
        String newValue = "Aman and Akku";
        System.out.println(newValue.substring(0, 3));
        System.out.println(newValue.length());
        System.out.println(newValue.substring(5, 9));
    }
}
