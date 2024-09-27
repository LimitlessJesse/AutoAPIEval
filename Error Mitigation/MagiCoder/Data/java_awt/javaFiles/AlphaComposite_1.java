import java.awt.AlphaComposite;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class AlphaComposite_1 {
    public static void main(String[] args) {
        try {
            BufferedImage src = ImageIO.read(new File("src.png"));
            BufferedImage dst = ImageIO.read(new File("dst.png"));

            Graphics2D g2d = dst.createGraphics();
            AlphaComposite ac = AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.5f);
            g2d.setComposite(ac);
            g2d.drawImage(src, null, 0, 0);
            g2d.dispose();

            ImageIO.write(dst, "PNG", new File("output.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
