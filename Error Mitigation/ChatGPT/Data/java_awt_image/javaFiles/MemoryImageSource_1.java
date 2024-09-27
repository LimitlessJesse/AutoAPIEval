import java.awt.image.MemoryImageSource;

public class MemoryImageSource_1 {
    public static void main(String[] args) {
        MemoryImageSource imageSource = new MemoryImageSource(100, 100, new int[10000], 0, 100);
        imageSource.setAnimated(true);
    }
}
