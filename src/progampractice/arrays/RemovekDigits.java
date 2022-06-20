package progampractice.arrays;

public class RemovekDigits {
    public static String removeKdigits(String num, int k) {
        int len = num.length();
        if (len == k) return "0";
        boolean flag = true;
        while (k-- > 0) {
            flag = false;
            for (int i = 0; i < len - 1; i++) {
                if (num.charAt(i) > num.charAt(i + 1)) {
                    num = charRemoveAt(num, i);
                    flag = true;
                    break;
                }
            }
            if (!flag) {
                num = charRemoveAt(num, len - 1);
            }
            len--;
        }
        if (num.charAt(0) == '0') {
            while (num.length() > 1 && num.charAt(0) == '0') {
                num = charRemoveAt(num, 0);
            }
        }
        return num;
    }

    public static String charRemoveAt(String str, int p) {
        return str.substring(0, p) + str.substring(p + 1);
    }

    public static void main(String[] args) {
        System.out.println(removeKdigits("1432219",3));
    }
}
