import javax.imageio.stream.MemoryCacheImageInputStream;
import javax.imageio.stream.ImageInputStream;

public class MemoryCacheImageInputStream_3 {
    public static void main(String[] args) {
        MemoryCacheImageInputStream imageInputStream = new MemoryCacheImageInputStream(null);
        boolean cached = imageInputStream.isCached();
        System.out.println("Is Cached: " + cached);
    }
}
