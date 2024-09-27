import javax.swing.JColorChooser;
import java.awt.Color;
import java.awt.Component;
import java.awt.HeadlessException;

public class JColorChooser_1 {
    public static void main(String[] args) {
        Component parentComponent = null; // Set your parent component here
        String title = "Choose a Color";
        Color initialColor = Color.RED;

        try {
            Color selectedColor = JColorChooser.showDialog(parentComponent, title, initialColor);
            if (selectedColor != null) {
                System.out.println("Selected color: " + selectedColor);
            } else {
                System.out.println("User opted out");
            }
        } catch (HeadlessException e) {
            System.out.println("HeadlessException: " + e.getMessage());
        }
    }
}
