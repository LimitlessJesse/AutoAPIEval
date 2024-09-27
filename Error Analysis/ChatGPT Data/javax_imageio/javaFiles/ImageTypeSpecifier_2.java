import javax.imageio.ImageTypeSpecifier;

public class ImageTypeSpecifier_2 {
    public static void main(String[] args) {
        ImageTypeSpecifier typeSpecifier = ImageTypeSpecifier.createInterleaved(
            new int[] {0}, // bands
            new int[] {DataBuffer.TYPE_BYTE}, // dataType
            false, // isAlphaPremultiplied
            false // hasAlpha
        );
        
        for (int i = 0; i < typeSpecifier.getNumBands(); i++) {
            int bitsPerBand = typeSpecifier.getBitsPerBand(i);
            System.out.println("Bits per band for band " + i + ": " + bitsPerBand);
        }
    }
}
