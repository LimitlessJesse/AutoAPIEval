import java.awt.image.IndexColorModel;

public class IndexColorModel_5 {
    public static void main(String[] args) {
        byte[] reds = {0, 255};
        byte[] greens = {0, 255};
        byte[] blues = {0, 255};
        IndexColorModel colorModel = new IndexColorModel(1, 2, reds, greens, blues);
        
        int transparentPixelIndex = colorModel.getTransparentPixel();
        System.out.println("Index of transparent pixel: " + transparentPixelIndex);
    }
}
