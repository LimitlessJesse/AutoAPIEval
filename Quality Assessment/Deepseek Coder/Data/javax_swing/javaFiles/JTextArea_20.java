import javax.swing.JTextArea;
import java.awt.Font;

public class JTextArea_20 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        Font font = new Font("Arial", Font.PLAIN, 16);
        textArea.setFont(font);
        textArea.setText("Hello, World!");
        System.out.println(textArea.getFont());
    }
}
