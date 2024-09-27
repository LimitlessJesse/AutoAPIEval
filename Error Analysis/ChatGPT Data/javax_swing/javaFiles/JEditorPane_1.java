import javax.swing.JEditorPane;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import java.awt.Dimension;

public class JEditorPane_1 {
    public static void setPage(JEditorPane editorPane, String url) {
        try {
            editorPane.setPage(url);
        } catch (Exception e) {
            editorPane.setContentType("text/html");
            editorPane.setText("<html>Page not found</html>");
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("JEditorPane Example");
        JEditorPane editorPane = new JEditorPane();
        JScrollPane scrollPane = new JScrollPane(editorPane);
        
        frame.add(scrollPane);
        frame.setSize(new Dimension(800, 600));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        
        setPage(editorPane, "https://www.google.com");
    }
}
