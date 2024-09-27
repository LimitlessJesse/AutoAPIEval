import java.awt.font.TextHitInfo;

public class TextHitInfo_2 {
    public static void main(String[] args) {
        TextHitInfo textHitInfo = TextHitInfo.leading(5);
        boolean leadingEdge = textHitInfo.isLeadingEdge();
        System.out.println("Is leading edge: " + leadingEdge);
    }
}
