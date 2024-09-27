import java.awt.ImageCapabilities;

public class ImageCapabilities_4 {
    public static void main(String[] args) {
        ImageCapabilities capabilities = new ImageCapabilities();
        boolean isVolatile = capabilities.isTrueVolatile();
        System.out.println("Is Volatile: " + isVolatile);
    }
}
