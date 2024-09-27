import java.util.Stack;
import java.util.EmptyStackException;

public class Stack_3 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        try {
            System.out.println("Top element of the stack: " + stack.peek());
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty");
        }
    }
}
