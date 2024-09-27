import javax.swing.colorchooser.DefaultColorSelectionModel;
import java.awt.Color;

public class DefaultColorSelectionModel_4 {
    public static void main(String[] args) {
        DefaultColorSelectionModel model = new DefaultColorSelectionModel();
        model.setSelectedColor(Color.BLUE);
        Color selectedColor = model.getSelectedColor();
        System.out.println("Selected Color: " + selectedColor);
    }
}
