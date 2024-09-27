import java.awt.TexturePaint;
import java.awt.image.BufferedImage;

public class TexturePaint_1 {
    public static void main(String[] args) {
        BufferedImage texture = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        TexturePaint texturePaint = new TexturePaint(texture, null);
        
        BufferedImage image = texturePaint.getImage();
        System.out.println("Image: " + image);
    }
}
