import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.ImageProducer;

public class Image_4 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Image image = toolkit.createImage("path_to_your_image.jpg");
        ImageProducer producer = image.getSource();
        System.out.println(producer);
    }
}
