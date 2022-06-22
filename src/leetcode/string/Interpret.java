package leetcode.string;

/*
Input: command = "G()(al)"
Output: "Goal"
Explanation: The Goal Parser interprets the command as follows:
G -> G
() -> o
(al) -> al
The final concatenated result is "Goal".
*/

import com.sun.javaws.progress.PreloaderPostEventListener;

public class Interpret {
    public static String interpret(String command) {
        /*if (command.contains("(al)") || command.contains("()")) {
            command = command.replace("(al)", "al");
            if (command.contains("()")) {
                command = command.replace("()", "o");
            }
        }*/
        //return command.replace("(al)","al").replace("()","o");
        StringBuilder str = new StringBuilder();

        for (int i = 0; i < command.length(); i++){
            System.out.println(command.charAt(i));
            if(command.charAt(i)=='G'){
                str.append("G");
            }
            else if( command.charAt(i)=='(' && command.charAt(i+1)==')'){
                str.append("o");
                i++;
            }
            else {
                str.append("al");
                i+=3;
            }
        }
        return str.toString();
    }

    public static void main(String[] args) {
        String command = "()(al)G(al)()()G";
        System.out.println(interpret(command));
    }
}
