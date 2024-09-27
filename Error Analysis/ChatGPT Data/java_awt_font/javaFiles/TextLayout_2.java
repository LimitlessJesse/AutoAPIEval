import java.awt.font.TextLayout;

public class TextLayout_2 {
    public static void main(String[] args) {
        // Create a new TextLayout object
        TextLayout textLayout = new TextLayout("Example Text", font, fontRenderContext);
        
        // Get a justified layout with the specified width
        TextLayout justifiedLayout = textLayout.getJustifiedLayout(200.0f);
        
        // Print out the bounds of the justified layout
        System.out.println(justifiedLayout.getBounds());
    }
}
