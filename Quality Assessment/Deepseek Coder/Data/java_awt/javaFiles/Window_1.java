import java.awt.Frame;
import java.awt.Dimension;

public class Window_1 {
    public static void main(String[] args) {
        Frame frame = new Frame("Test Window");
        frame.setPreferredSize(new Dimension(300, 200));
        frame.pack();
        frame.setVisible(true);
    }
}
