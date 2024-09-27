import java.awt.image.MemoryImageSource;

public class MemoryImageSource_2 {
    public static void main(String[] args) {
        int[] pixels = {0xFF000000, 0xFFFFFFFF}; // Example pixel values
        MemoryImageSource imageSource = new MemoryImageSource(2, 1, pixels, 0, 2);
        imageSource.newPixels();
    }
}
