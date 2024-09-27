import java.util.Stack;

public class Stack_3 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(1);
        stack.push(2);
        stack.push(3);
        
        System.out.println("Stack before pop: " + stack);
        
        int poppedElement = stack.pop();
        
        System.out.println("Popped element: " + poppedElement);
        System.out.println("Stack after pop: " + stack);
    }
}
