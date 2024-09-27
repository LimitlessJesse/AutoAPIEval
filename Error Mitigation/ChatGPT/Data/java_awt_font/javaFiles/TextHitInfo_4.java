import java.awt.font.TextHitInfo;

public class TextHitInfo_4 {
    public static void main(String[] args) {
        TextHitInfo hitInfo = TextHitInfo.afterOffset(5);
        TextHitInfo otherHitInfo = hitInfo.getOtherHit();
        System.out.println(otherHitInfo);
    }
}
