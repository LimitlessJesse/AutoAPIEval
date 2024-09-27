import javax.swing.text.GlyphView;

public class GlyphView_2 {
    public static void main(String[] args) {
        GlyphView glyphView = new GlyphView(null);
        int endOffset = glyphView.getEndOffset();
        System.out.println("End offset: " + endOffset);
    }
}
