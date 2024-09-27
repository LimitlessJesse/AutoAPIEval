import java.awt.image.DirectColorModel;

public class DirectColorModel_2 {
    public static void main(String[] args) {
        DirectColorModel dcm = new DirectColorModel(32, 0x00ff0000, 0x0000ff00, 0x000000ff);
        int pixel = 0xff0000a0;
        int red = dcm.getRed(pixel);
        System.out.println("Red value: " + red);
    }
}
