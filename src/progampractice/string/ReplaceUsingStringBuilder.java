package progampractice.string;

public class ReplaceUsingStringBuilder {
    public static void main(String[] args) {
        String address = "1.1.1.1";
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < address.length(); i++) {
            if (address.charAt(i) != '.') {
                str.append(address.charAt(i));
            } else {
                str.append("[.]");
            }
        }
        System.out.println(str.toString());
    }
}
