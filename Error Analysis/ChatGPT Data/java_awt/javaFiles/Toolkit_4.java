import java.awt.Toolkit;
import java.awt.image.ColorModel;

public class Toolkit_4 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        ColorModel colorModel = toolkit.getColorModel();
        System.out.println("Color Model: " + colorModel);
    }
}
