import java.awt.Checkbox;

public class Checkbox_2 {
    public static void main(String[] args) {
        Checkbox checkbox = new Checkbox("Check me");
        System.out.println("Initial state: " + checkbox.getState());
        
        // Changing the state using setState method
        checkbox.setState(true);
        System.out.println("Updated state: " + checkbox.getState());
    }
}
