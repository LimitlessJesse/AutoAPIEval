import java.util.Stack;

public class Stack_5 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        int pos = stack.search("World");
        System.out.println(pos);
    }
}
