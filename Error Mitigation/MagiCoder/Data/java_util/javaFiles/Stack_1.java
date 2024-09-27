import java.util.Stack;

public class Stack_1 {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        System.out.println("Is the stack empty? " + stack.empty());
        
        stack.push("Hello");
        System.out.println("Is the stack empty? " + stack.empty());
    }
}
