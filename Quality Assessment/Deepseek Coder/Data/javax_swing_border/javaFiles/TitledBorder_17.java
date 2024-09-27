import javax.swing.border.TitledBorder;
import java.awt.Color;

public class TitledBorder_17 {
    public static void main(String[] args) {
        TitledBorder border = new TitledBorder("Title");
        border.setTitleColor(Color.RED);
        System.out.println("Title color: " + border.getTitleColor());
    }
}
