import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println(stack.isEmpty()); // true

        stack.push("Hello");
        System.out.println(stack.isEmpty()); // false
    }
}
