import java.awt.Dimension;
import java.awt.Toolkit;

public class Toolkit_1 {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        System.out.println("Screen Size: " + screenSize.getWidth() + "x" + screenSize.getHeight());
    }
}
