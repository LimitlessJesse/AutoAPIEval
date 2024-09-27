import java.awt.font.TextHitInfo;

public class TextHitInfo_1 {
    public static void main(String[] args) {
        TextHitInfo hitInfo = TextHitInfo.beforeChar(3);
        int insertionIndex = hitInfo.getInsertionIndex();
        System.out.println("Insertion index: " + insertionIndex);
    }
}
