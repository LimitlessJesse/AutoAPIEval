import java.awt.image.IndexColorModel;

public class IndexColorModel_1 {
    public static void main(String[] args) {
        IndexColorModel colorModel = new IndexColorModel(8, 3, new byte[]{0, 85, 170}, new byte[]{0, 85, 170}, new byte[]{0, 85, 170});
        int pixel = colorModel.getRGB(1);
        int red = colorModel.getRed(pixel);
        System.out.println("Red value: " + red);
    }
}
