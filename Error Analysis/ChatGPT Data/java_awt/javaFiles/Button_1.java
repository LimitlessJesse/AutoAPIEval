import java.awt.Button;

public class Button_1 {
    public static void main(String[] args) {
        Button button = new Button("Click Me");
        button.setLabel("New Label");
        System.out.println("Button label: " + button.getLabel());
    }
}
