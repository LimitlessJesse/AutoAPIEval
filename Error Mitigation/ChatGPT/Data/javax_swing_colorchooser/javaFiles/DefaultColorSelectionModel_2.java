import javax.swing.colorchooser.DefaultColorSelectionModel;
import java.awt.Color;

public class DefaultColorSelectionModel_2 {
    public static void main(String[] args) {
        DefaultColorSelectionModel colorSelectionModel = new DefaultColorSelectionModel();
        Color newColor = Color.RED;
        colorSelectionModel.setSelectedColor(newColor);
    }
}
