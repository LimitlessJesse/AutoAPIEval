import javax.swing.JColorChooser;
import javax.swing.JFrame;
import java.awt.Color;

public class JColorChooser_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setVisible(true);

        Color defaultColor = Color.white;
        Color selectedColor = JColorChooser.showDialog(frame, "Select Color", defaultColor);

        if (selectedColor!= null) {
            System.out.println("Red: " + selectedColor.getRed());
            System.out.println("Green: " + selectedColor.getGreen());
            System.out.println("Blue: " + selectedColor.getBlue());
        }
    }
}
