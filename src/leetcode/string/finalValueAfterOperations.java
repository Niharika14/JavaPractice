package leetcode.string;

/*
["--X","X++","X++"] //1
["++X","++X","X++"] //3
["X++","++X","--X","X--"] //0
* */

public class finalValueAfterOperations {
    public static int finalValueAfterOperations(String[] operations) {
        int count = 0;
        for(int i=0;i<operations.length;i++){
            if(operations[i].contains("++")){
                count = count+1;
            }
            else{
                count = count-1;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] operations = {"++X","++X","X++"};
        int count = finalValueAfterOperations(operations);
        System.out.println(count);
    }
}
