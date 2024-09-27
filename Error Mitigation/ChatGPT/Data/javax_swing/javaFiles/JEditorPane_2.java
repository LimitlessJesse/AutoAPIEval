import javax.swing.JEditorPane;

public class JEditorPane_2 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        editorPane.setText("<html><body><h1>Hello, World!</h1></body></html>");
        System.out.println(editorPane.getText());
    }
}
