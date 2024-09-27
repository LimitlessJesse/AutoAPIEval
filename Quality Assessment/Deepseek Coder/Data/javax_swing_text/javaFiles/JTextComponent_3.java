import javax.swing.JTextField;
import javax.swing.text.JTextComponent;

public class JTextComponent_3 {
    public static void main(String[] args) {
        JTextComponent textComponent = new JTextField();
        textComponent.setText("Hello, World!");
        String text = textComponent.getText();
        System.out.println(text);
    }
}
