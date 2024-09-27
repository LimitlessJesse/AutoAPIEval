import java.awt.Image;
import java.awt.image.ImageObserver;

public class Image_2 {
    public static void main(String[] args) {
        Image image = new Image() {
            @Override
            public int getWidth(ImageObserver observer) {
                return 0;
            }

            // Other methods are not implemented here
        };

        int width = image.getWidth(null);
        System.out.println("Width: " + width);
    }
}
