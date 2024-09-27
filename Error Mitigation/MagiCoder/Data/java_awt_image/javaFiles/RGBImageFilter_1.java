import java.awt.image.RGBImageFilter;

public class RGBImageFilter_1 {
    public static void main(String[] args) {
        RGBImageFilter filter = new RGBImageFilter() {
            public int filterRGB(int x, int y, int rgb) {
                int red = (rgb & 0xFF0000) >> 16;
                int green = (rgb & 0x00FF00) >> 8;
                int blue = rgb & 0x0000FF;

                red = 255 - red;
                green = 255 - green;
                blue = 255 - blue;

                return (rgb & 0xFF000000) | (red << 16) | (green << 8) | blue;
            }
        };

        // Now you can use the filter to modify an image.
    }
}
