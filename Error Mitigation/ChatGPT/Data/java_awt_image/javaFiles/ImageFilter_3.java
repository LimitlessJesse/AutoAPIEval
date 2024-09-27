import java.awt.image.ImageFilter;

public class ImageFilter_3 {
    public static void main(String[] args) {
        ImageFilter filter = new ImageFilter() {
            @Override
            public void setHints(int hints) {
                // Filter the hints provided by ImageConsumer
                System.out.println("Hints filtered: " + hints);
            }
        };

        // Calling the setHints method
        filter.setHints(123);
    }
}
