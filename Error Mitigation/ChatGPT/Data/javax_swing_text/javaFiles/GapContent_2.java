import javax.swing.text.GapContent;
import javax.swing.text.BadLocationException;

public class GapContent_2 {
    public static void main(String[] args) {
        GapContent content = new GapContent();
        
        try {
            content.getString(0, 5);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
