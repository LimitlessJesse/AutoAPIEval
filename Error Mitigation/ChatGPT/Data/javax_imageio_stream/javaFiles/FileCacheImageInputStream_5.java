import javax.imageio.stream.FileCacheImageInputStream;
import javax.imageio.stream.ImageInputStream;

public class FileCacheImageInputStream_5 {
    public static void main(String[] args) {
        FileCacheImageInputStream imageInputStream = new FileCacheImageInputStream(null);
        boolean cached = imageInputStream.isCached();
        System.out.println("Is cached: " + cached);
    }
}
