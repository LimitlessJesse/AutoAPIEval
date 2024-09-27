import java.util.Stack;

public class Stack_5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        
        int position = stack.search(20);
        System.out.println("Position of 20 in the stack: " + position);
        
        position = stack.search(40);
        System.out.println("Position of 40 in the stack: " + position);
    }
}
