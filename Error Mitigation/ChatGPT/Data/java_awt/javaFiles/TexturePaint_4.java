import java.awt.TexturePaint;
import java.awt.image.BufferedImage;
import java.awt.Transparency;

public class TexturePaint_4 {
    public static void main(String[] args) {
        BufferedImage texture = new BufferedImage(10, 10, BufferedImage.TYPE_INT_ARGB);
        TexturePaint texturePaint = new TexturePaint(texture, null);
        
        int transparency = texturePaint.getTransparency();
        System.out.println("Transparency mode: " + transparency);
    }
}
