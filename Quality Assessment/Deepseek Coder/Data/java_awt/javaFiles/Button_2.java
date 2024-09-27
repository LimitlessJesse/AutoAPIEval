import javax.swing.JButton;

public class Button_2 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        String label = button.getText();
        System.out.println("Button label: " + label);
    }
}
