import java.awt.TexturePaint;
import java.awt.Shape;
import java.awt.geom.Rectangle2D;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferedImage;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.Paint;

public class TexturePaint_3 {
    public static void main(String[] args) {
        // Create a BufferedImage
        BufferedImage image = new BufferedImage(100, 100, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = image.createGraphics();
        g2d.setColor(Color.RED);
        g2d.fillRect(0, 0, 100, 100);
        g2d.dispose();

        // Create a Shape
        Shape shape = new Rectangle2D.Double(0, 0, 100, 100);

        // Create a TexturePaint
        Paint paint = new TexturePaint(image, shape);

        // Get the BufferedImage from the TexturePaint
        BufferedImage textureImage = ((TexturePaint) paint).getImage();

        // Print the textureImage
        for (int y = 0; y < textureImage.getHeight(); y++) {
            for (int x = 0; x < textureImage.getWidth(); x++) {
                System.out.print(textureImage.getRGB(x, y) + " ");
            }
            System.out.println();
        }
    }
}
