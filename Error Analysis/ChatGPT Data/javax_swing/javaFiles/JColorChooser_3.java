import javax.swing.JColorChooser;
import java.awt.Color;

public class JColorChooser_3 {
    public static void main(String[] args) {
        Color color = JColorChooser.showDialog(null, "Choose a Color", Color.RED);
        System.out.println("Selected color: " + color);
    }
}
