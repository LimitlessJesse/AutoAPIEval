import javax.swing.JEditorPane;
import javax.swing.text.html.HTMLEditorKit;
import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JScrollPane;

public class JEditorPane_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("JEditorPane Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JEditorPane editorPane = new JEditorPane();
        editorPane.setContentType("text/html");

        JScrollPane scrollPane = new JScrollPane(editorPane);
        frame.getContentPane().add(scrollPane, BorderLayout.CENTER);

        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}
