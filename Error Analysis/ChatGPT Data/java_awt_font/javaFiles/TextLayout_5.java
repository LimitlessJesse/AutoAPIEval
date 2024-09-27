import java.awt.font.TextHitInfo;

public class TextLayout_5 {
    public static void main(String[] args) {
        // Create a TextLayout object
        java.awt.font.TextLayout textLayout = new java.awt.font.TextLayout("Sample Text", new java.awt.Font("Arial", java.awt.Font.PLAIN, 12), new java.awt.font.FontRenderContext(null, true, true));
        
        // Call hitTestChar method to get TextHitInfo
        java.awt.font.TextHitInfo textHitInfo = textLayout.hitTestChar(30.0f, 20.0f);
        
        // Print the TextHitInfo
        System.out.println(textHitInfo);
    }
}
