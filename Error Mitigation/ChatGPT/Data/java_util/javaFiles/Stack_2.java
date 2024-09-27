import java.util.Stack;
import java.util.EmptyStackException;

public class Stack_2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        try {
            int poppedElement = stack.pop();
            System.out.println("Popped element: " + poppedElement);
            System.out.println("Stack after pop: " + stack);
        } catch (EmptyStackException e) {
            System.out.println("Stack is empty");
        }
    }
}
