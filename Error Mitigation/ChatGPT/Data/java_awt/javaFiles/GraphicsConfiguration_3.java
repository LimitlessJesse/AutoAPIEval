import java.awt.GraphicsConfiguration;

public class GraphicsConfiguration_3 {
    public static void main(String[] args) {
        GraphicsConfiguration gc = // get GraphicsConfiguration object
        BufferCapabilities bufferCapabilities = gc.getBufferCapabilities();
        System.out.println(bufferCapabilities);
    }
}
