import javax.swing.JTextPane;

public class JTextPane_3 {
    public static void main(String[] args) {
        JTextPane textPane = new JTextPane();
        textPane.setText("This is some sample text.");

        // Replace the selected text with new content
        textPane.replaceSelection("Replaced text");

        System.out.println(textPane.getText());
    }
}
