import javax.swing.JTextArea;

public class JTextArea_2 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        textArea.insert("Hello World", 0);
        System.out.println(textArea.getText());
    }
}
