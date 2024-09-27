import java.awt.image.ImageFilter;

public class ImageFilter_4 {
    public static void main(String[] args) {
        ImageFilter filter = new ImageFilter() {
            @Override
            public void setDimensions(int width, int height) {
                // Implement your logic here
                System.out.println("Width: " + width + ", Height: " + height);
            }
        };
        
        filter.setDimensions(100, 200);
    }
}
