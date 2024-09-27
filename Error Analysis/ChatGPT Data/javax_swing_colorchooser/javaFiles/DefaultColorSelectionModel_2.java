import javax.swing.colorchooser.DefaultColorSelectionModel;
import java.awt.Color;

public class DefaultColorSelectionModel_2 {
    public static void main(String[] args) {
        DefaultColorSelectionModel colorSelectionModel = new DefaultColorSelectionModel();
        Color selectedColor = colorSelectionModel.getSelectedColor();
        System.out.println("Selected Color: " + selectedColor);
    }
}
