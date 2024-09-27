import java.util.Stack;

public class Stack_2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");

        // Peek at the top element
        String topElement = stack.peek();
        System.out.println("Top element: " + topElement);

        // The stack remains unchanged
        System.out.println("Stack after peek: " + stack);
    }
}
