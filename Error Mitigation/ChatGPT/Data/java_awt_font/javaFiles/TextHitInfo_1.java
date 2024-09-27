import java.awt.font.TextHitInfo;

public class TextHitInfo_1 {
    public static void main(String[] args) {
        TextHitInfo textHitInfo = TextHitInfo.afterOffset(5);
        int insertionIndex = textHitInfo.getInsertionIndex();
        System.out.println("Insertion Index: " + insertionIndex);
    }
}
