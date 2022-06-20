package leetcode.string;
/*
    Input: sentences = ["please wait", "continue to fight", "continue to win"]
    Output: 3
    Explanation: It is possible that multiple sentences contain the same number of words.
    In this example, the second and third sentences (underlined) have the same number of words.

*/
public class MostWordsFound {
    public static int mostWordsFound(String[] sentences) {
        int larg = 0;
        for(String e: sentences){
            String[] count = e.split(" ");
            int leng = count.length;
            if(leng >= larg){
                larg = leng;
            }
            }
        return larg;
        }

    public static void main(String[] args) {
        String[] sentences = {"alice and bob love leetcode", "i think so too", "this is great thanks very much"};
        int largerst = mostWordsFound(sentences);
        System.out.println(largerst);
    }
}
