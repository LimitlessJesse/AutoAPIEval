import javax.swing.text.GapContent;
import javax.swing.text.GapContent.Gap;

public class GapContent_1 {
    public static void main(String[] args) {
        GapContent gapContent = new GapContent();
        gapContent.insertString(0, "Hello", null);
        gapContent.insertString(5, " World", null);
        gapContent.remove(0, 5);
        Gap gap = gapContent.getGap(0);
        int gapStart = gap.getGapStart();
        System.out.println("Gap start position: " + gapStart);
    }
}
