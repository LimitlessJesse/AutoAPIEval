import java.awt.Dimension;
import java.awt.Toolkit;

public class Toolkit_1 {
    public static void main(String[] args) {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension screenSize = toolkit.getScreenSize();
        System.out.println("Screen width: " + screenSize.getWidth());
        System.out.println("Screen height: " + screenSize.getHeight());
    }
}
