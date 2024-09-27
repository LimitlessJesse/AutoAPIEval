import java.awt.font.TextHitInfo;

public class TextHitInfo_5 {
    public static void main(String[] args) {
        TextHitInfo hitInfo = TextHitInfo.leading(2); // Creating a TextHitInfo object with a leading edge at index 2
        boolean leadingEdge = hitInfo.isLeadingEdge(); // Checking if the hitInfo is at the leading edge
        System.out.println("Is Leading Edge: " + leadingEdge);
    }
}
