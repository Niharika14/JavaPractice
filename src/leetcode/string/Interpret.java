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

public class Interpret {
    public static String interpret(String command) {
        /*if (command.contains("(al)") || command.contains("()")) {
            command = command.replace("(al)", "al");
            if (command.contains("()")) {
                command = command.replace("()", "o");
            }
        }*/
        return command.replace("(al)","al").replace("()","o");
    }

    public static void main(String[] args) {
        String command = "()(al)G(al)()()G";
        System.out.println(interpret(command));
    }
}
