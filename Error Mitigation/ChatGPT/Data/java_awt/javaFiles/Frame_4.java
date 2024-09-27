import java.awt.Color;
import java.awt.Frame;

public class Frame_4 {
    public static void main(String[] args) {
        Frame frame = new Frame("Example Frame");
        frame.setSize(400, 400);
        frame.setVisible(true);
        
        Color bgColor = new Color(255, 0, 0); // Red color
        frame.setBackground(bgColor);
    }
}
