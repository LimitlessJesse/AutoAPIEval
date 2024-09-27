import java.util.Stack;

public class Stack_2 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Top element of the stack: " + stack.peek());
    }
}
