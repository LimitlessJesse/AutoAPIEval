import java.awt.Button;

public class Button_2 {
    public static void main(String[] args) {
        Button button = new Button("Click Me");
        System.out.println("Before setting label: " + button.getLabel());
        
        button.setLabel("Press Me");
        System.out.println("After setting label: " + button.getLabel());
    }
}
