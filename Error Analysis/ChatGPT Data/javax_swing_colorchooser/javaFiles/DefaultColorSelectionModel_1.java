import javax.swing.colorchooser.DefaultColorSelectionModel;
import java.awt.Color;

public class DefaultColorSelectionModel_1 {
    public static void main(String[] args) {
        DefaultColorSelectionModel model = new DefaultColorSelectionModel();
        Color color = Color.RED;
        model.setSelectedColor(color);
        System.out.println(model.getSelectedColor());
    }
}
