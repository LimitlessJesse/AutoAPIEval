import java.util.zip.InflaterInputStream;

public class InflaterInputStream_4 {
    public static void main(String[] args) {
        InflaterInputStream inputStream = new InflaterInputStream(System.in);
        boolean isMarkSupported = inputStream.markSupported();
        System.out.println("Is mark supported: " + isMarkSupported);
    }
}
