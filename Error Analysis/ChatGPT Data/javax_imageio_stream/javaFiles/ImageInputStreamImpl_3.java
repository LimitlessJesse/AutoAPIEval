import javax.imageio.stream.ImageInputStreamImpl;

public class ImageInputStreamImpl_3 {
    public static void main(String[] args) {
        ImageInputStreamImpl stream = new ImageInputStreamImpl();
        try {
            long value = stream.readLong();
            System.out.println("Long value: " + value);
        } catch (Exception e) {
            System.out.println("Error reading long value: " + e.getMessage());
        }
    }
}
