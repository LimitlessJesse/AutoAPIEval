import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.awt.geom.Rectangle2D;

public class TexturePaint_2 {
    public static void main(String[] args) {
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        TexturePaint texture = new TexturePaint(image, new Rectangle2D.Double(0, 0, 100, 100));
        
        BufferedImage paintedImage = texture.getImage();
        System.out.println("Image retrieved from TexturePaint: " + paintedImage);
    }
}
