import java.awt.font.TextLayout;
import java.awt.font.TextHitInfo;

public class TextLayout_4 {
    public static void main(String[] args) {
        TextLayout textLayout = new TextLayout("Example Text", null, null);
        TextHitInfo hitInfo = textLayout.hitTestChar(10.0f, 20.0f);
        System.out.println("Hit character: " + hitInfo.getCharIndex());
        System.out.println("Edge: " + (hitInfo.isLeadingEdge() ? "Leading" : "Trailing"));
    }
}
