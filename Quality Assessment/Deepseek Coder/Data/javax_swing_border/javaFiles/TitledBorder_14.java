import javax.swing.border.TitledBorder;
import java.awt.*;

public class TitledBorder_14 {
    public static void main(String[] args) {
        TitledBorder titledBorder = BorderFactory.createTitledBorder("Title");
        Font font = titledBorder.getTitleFont();
        System.out.println(font);
    }
}
