import java.util.Stack;

public class Stack_5 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);

        int position = stack.search(2);
        System.out.println("Position of 2 in the stack: " + position);

        position = stack.search(4);
        System.out.println("Position of 4 in the stack: " + position);
    }
}
