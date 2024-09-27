import javax.swing.text.AbstractDocument;
import javax.swing.text.BadLocationException;

public class StringContent_2 {
    public static void main(String[] args) {
        AbstractDocument.Content content = new javax.swing.text.StringContent();
        try {
            String retrievedString = content.getString(0, 5);
            System.out.println(retrievedString);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
