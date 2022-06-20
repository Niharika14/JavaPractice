package leetcode.string;

/*
Input: jewels = "aA", stones = "aAAbbbb"
Output: 3
Input: jewels = "z", stones = "ZZ"
Output: 0
* */
public class NumJewelsInStones {
    public static int numJewelsInStones(String jewels, String stones) {
        int count =0;
        for(int i =0;i<stones.length();i++){
            for(int j =0; j<jewels.length(); j++){
                if(stones.charAt(i) == jewels.charAt(j)){
                    count ++;
                }
            }
        }
        return count ;
    }

    public static void main(String[] args) {
        String jewels = "z";
        String stones = "ZZ";
        System.out.println("Count: "+numJewelsInStones(jewels,stones));
    }
}
