import javax.swing.JColorChooser;
import java.awt.Color;

public class JColorChooser_3 {
    public static void main(String[] args) {
        JColorChooser colorChooser = new JColorChooser();
        Color selectedColor = colorChooser.getColor();
        System.out.println("Selected color: " + selectedColor);
    }
}
