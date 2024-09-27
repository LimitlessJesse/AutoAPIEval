import javax.swing.JEditorPane;

public class JEditorPane_3 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setText("This is a sample text.");
        String text = editorPane.getText();
        System.out.println(text);
    }
}
