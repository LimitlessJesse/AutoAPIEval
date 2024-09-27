import javax.imageio.ImageTypeSpecifier;

public class ImageTypeSpecifier_1 {
    public static void main(String[] args) {
        ImageTypeSpecifier imageTypeSpecifier = new ImageTypeSpecifier();
        int numBands = imageTypeSpecifier.getNumBands();
        System.out.println("Number of bands: " + numBands);
    }
}
