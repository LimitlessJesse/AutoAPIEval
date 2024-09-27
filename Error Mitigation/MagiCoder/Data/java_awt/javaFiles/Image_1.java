import java.awt.Image;
import java.awt.image.ImageObserver;

public class Image_1 {
    public static void main(String[] args) {
        Image image = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            @Override
            public int getHeight(ImageObserver observer) {
                return 0;
            }

            // Other methods are not implemented here
        };

        int height = image.getHeight(null);
        System.out.println("Height: " + height);
    }
}
