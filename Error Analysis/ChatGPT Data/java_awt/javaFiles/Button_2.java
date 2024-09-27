import java.awt.Button;

public class Button_2 {
    public static void main(String[] args) {
        Button button = new Button("Click Me");
        String label = button.getLabel();
        System.out.println("Button label: " + label);
    }
}
