import java.util.Stack;

public class Stack_2 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("Hello");
        stack.push("World");
        
        // peek at the top element
        String topElement = stack.peek();
        System.out.println(topElement);  // Output: World
        
        // print the stack
        System.out.println(stack);  // Output: [Hello, World]
    }
}
