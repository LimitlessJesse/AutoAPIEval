import java.awt.Frame;

public class Frame_5 {
    public static void main(String[] args) {
        Frame frame = new Frame("Resizable Frame");
        frame.setSize(400, 400);
        frame.setVisible(true);
        
        // Setting resizable to false
        frame.setResizable(false);
    }
}
