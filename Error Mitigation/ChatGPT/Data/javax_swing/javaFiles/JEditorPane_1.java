import javax.swing.JEditorPane;
import java.io.IOException;

public class JEditorPane_1 {
    public static void main(String[] args) {
        JEditorPane editorPane = new JEditorPane();
        try {
            editorPane.setPage("https://www.example.com");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
