import java.awt.Image;
import java.awt.image.ImageObserver;

public class Image_1 {
    public static void main(String[] args) {
        Image image = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 100;  // Returning a dummy width
            }

            // Other methods are not implemented
        };

        System.out.println("Width of the image: " + image.getWidth(null));
    }
}
