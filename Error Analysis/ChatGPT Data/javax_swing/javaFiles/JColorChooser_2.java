import javax.swing.JColorChooser;
import java.awt.Color;

public class JColorChooser_2 {
    public static void main(String[] args) {
        Color selectedColor = JColorChooser.showDialog(null, "Choose a Color", Color.WHITE);
        System.out.println("Selected Color: " + selectedColor);
    }
}
