import java.util.Stack;

public class Stack_5 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        stack.push("Java");

        int position = stack.search("Java");
        System.out.println(position);
    }
}
