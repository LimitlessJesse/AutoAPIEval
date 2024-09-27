import java.awt.Dimension;
import java.awt.Frame;

public class Window_2 {
    public static void main(String[] args) {
        Frame frame = new Frame("Resizable Window Example");
        frame.setSize(400, 300);
        frame.setVisible(true);
        
        // Resizing the window
        frame.setSize(new Dimension(600, 400));
    }
}
