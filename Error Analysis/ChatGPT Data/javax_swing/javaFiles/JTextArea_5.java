import javax.swing.JTextArea;

public class JTextArea_5 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        textArea.setLineWrap(true);
        textArea.setText("This is a long text that will wrap to the next line if the line wrap is enabled.");
    }
}
