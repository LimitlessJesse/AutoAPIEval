import java.awt.font.TextHitInfo;

public class TextHitInfo_4 {
    public static void main(String[] args) {
        TextHitInfo hitInfo = new TextHitInfo(1, 0.5f, true, true);
        int insertionIndex = hitInfo.getInsertionIndex();
        System.out.println("Insertion Index: " + insertionIndex);
    }
}
