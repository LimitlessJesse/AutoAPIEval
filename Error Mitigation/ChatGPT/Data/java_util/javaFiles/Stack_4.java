import java.util.Stack;

public class Stack_4 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        
        System.out.println("Is stack empty? " + stack.empty());
        
        stack.push(1);
        System.out.println("Is stack empty? " + stack.empty());
    }
}
