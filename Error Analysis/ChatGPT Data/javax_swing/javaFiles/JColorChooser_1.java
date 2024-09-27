import javax.swing.JColorChooser;
import javax.swing.JFrame;
import java.awt.Color;

public class JColorChooser_1 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.setVisible(true);

        Color initialColor = Color.RED;

        Color selectedColor = JColorChooser.showDialog(frame, "Choose a color", initialColor);

        System.out.println("Selected color: " + selectedColor);
    }
}
