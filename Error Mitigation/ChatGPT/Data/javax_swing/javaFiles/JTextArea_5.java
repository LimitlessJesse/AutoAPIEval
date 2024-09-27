import javax.swing.JTextArea;

public class JTextArea_5 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        System.out.println("Line wrap set to: " + textArea.getLineWrap());
    }
}
