import javax.swing.text.GapContent;
import javax.swing.text.BadLocationException;

public class GapContent_2 {
    public static void main(String[] args) {
        GapContent gapContent = new GapContent();
        try {
            gapContent.insertString(0, "Hello", null);
            int gapEnd = gapContent.getGapEnd();
            System.out.println("The end of the gap is at offset: " + gapEnd);
        } catch (BadLocationException e) {
            e.printStackTrace();
        }
    }
}
