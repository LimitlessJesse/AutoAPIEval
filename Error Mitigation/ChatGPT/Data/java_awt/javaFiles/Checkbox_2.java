import java.awt.Checkbox;

public class Checkbox_2 {
    public static void main(String[] args) {
        Checkbox checkbox = new Checkbox("My Checkbox");
        System.out.println("Initial state: " + checkbox.getState());
        
        checkbox.setState(true);
        System.out.println("State after setting to true: " + checkbox.getState());
        
        checkbox.setState(false);
        System.out.println("State after setting to false: " + checkbox.getState());
    }
}
