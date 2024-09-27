import java.awt.Dimension;
import java.awt.Toolkit;

public class Toolkit_1 {
    public static void main(String[] args) {
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();
        System.out.println("Screen Width: " + width);
        System.out.println("Screen Height: " + height);
    }
}
