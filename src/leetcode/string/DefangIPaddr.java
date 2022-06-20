package leetcode.string;

/*
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"
*/
public class DefangIPaddr {
    public static String defangIPaddr(String address) {
        return address.replace(".","[.]");
    }

    public static void main(String[] args) {
        String address = "255.100.50.0";
        System.out.println(defangIPaddr(address));
    }
}
