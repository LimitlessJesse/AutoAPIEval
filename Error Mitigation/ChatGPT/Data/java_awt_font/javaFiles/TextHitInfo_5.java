import java.awt.font.TextHitInfo;

public class TextHitInfo_5 {
    public static void main(String[] args) {
        TextHitInfo textHitInfo = TextHitInfo.afterOffset(5);
        int charIndex = textHitInfo.getCharIndex();
        System.out.println("Character index hit: " + charIndex);
    }
}
