import java.awt.font.TextHitInfo;

public class TextHitInfo_2 {
    public static void main(String[] args) {
        TextHitInfo info = TextHitInfo.trailing(5);
        int charIndex = info.getCharIndex();
        System.out.println("Character index: " + charIndex);
    }
}
