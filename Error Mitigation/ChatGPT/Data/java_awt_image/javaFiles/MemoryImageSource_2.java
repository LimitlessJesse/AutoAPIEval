import java.awt.image.MemoryImageSource;

public class MemoryImageSource_2 {
    public static void main(String[] args) {
        MemoryImageSource imageSource = new MemoryImageSource(100, 100);
        imageSource.setFullBufferUpdates(true);
    }
}
