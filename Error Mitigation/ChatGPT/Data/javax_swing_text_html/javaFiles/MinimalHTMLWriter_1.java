import javax.swing.text.html.MinimalHTMLWriter;
import javax.swing.text.StyledDocument;
import javax.swing.text.BadLocationException;
import java.io.IOException;

public class MinimalHTMLWriter_1 {
    public static void main(String[] args) {
        MinimalHTMLWriter writer = new MinimalHTMLWriter();
        StyledDocument doc = // get your StyledDocument instance here

        try {
            writer.write(doc);
        } catch (IOException | BadLocationException e) {
            e.printStackTrace();
        }
    }
}
