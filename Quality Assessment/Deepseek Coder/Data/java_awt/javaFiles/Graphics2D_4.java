import java.awt.Graphics2D;
import java.awt.Font;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

public class Graphics2D_4 {
    public static void main(String[] args) {
        try {
            // Create a BufferedImage object
            BufferedImage image = new BufferedImage(500, 500, BufferedImage.TYPE_INT_ARGB);

            // Get the Graphics2D object from the BufferedImage
            Graphics2D g2d = image.createGraphics();

            // Set the font and color
            g2d.setFont(new Font("Arial", Font.PLAIN, 20));
            g2d.setColor(Color.BLACK);

            // Draw the string
            g2d.drawString("Hello, World!!!", 50, 100);

            // Dispose the Graphics2D object
            g2d.dispose();

            // Save the image to a file
            ImageIO.write(image, "png", new File("image.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
