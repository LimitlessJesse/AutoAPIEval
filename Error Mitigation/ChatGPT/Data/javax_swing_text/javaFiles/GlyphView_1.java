import javax.swing.text.GlyphView;

public class GlyphView_1 {
    public static void main(String[] args) {
        GlyphView glyphView = new GlyphView(null);
        int startOffset = glyphView.getStartOffset();
        System.out.println("Start offset: " + startOffset);
    }
}
