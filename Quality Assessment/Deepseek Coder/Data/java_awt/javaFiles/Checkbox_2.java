import java.awt.*;

public class Checkbox_2 {
    public static void main(String[] args) {
        Checkbox cb = new Checkbox("Check me");
        cb.setState(true); // Checkbox is selected
        System.out.println("Checkbox state: " + cb.getState());
        
        cb.setState(false); // Checkbox is unselected
        System.out.println("Checkbox state: " + cb.getState());
    }
}
