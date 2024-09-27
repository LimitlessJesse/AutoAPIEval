import java.awt.TexturePaint;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;

public class TexturePaint_4 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        Rectangle2D rect = new Rectangle2D.Double(0, 0, 10, 10);
        TexturePaint texture = new TexturePaint(image, rect);
        
        // Get the transparency value
        int transparency = texture.getTransparency();
        System.out.println("Transparency value: " + transparency);
    }
}
