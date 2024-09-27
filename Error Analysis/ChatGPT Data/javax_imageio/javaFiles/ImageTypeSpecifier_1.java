import javax.imageio.ImageTypeSpecifier;

public class ImageTypeSpecifier_1 {
    public static void main(String[] args) {
        ImageTypeSpecifier imageTypeSpecifier = new ImageTypeSpecifier();
        int numComponents = imageTypeSpecifier.getNumComponents();
        System.out.println("Number of components: " + numComponents);
    }
}
