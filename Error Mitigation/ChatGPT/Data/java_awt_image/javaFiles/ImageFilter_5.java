import java.awt.image.ImageFilter;

public class ImageFilter_5 {
    public static void main(String[] args) {
        ImageFilter filter = new ImageFilter() {
            @Override
            public void imageComplete(int status) {
                // Add your filtering logic here
                System.out.println("Image loading status: " + status);
            }
        };
        
        // Call the imageComplete method with a status
        filter.imageComplete(1);
    }
}
