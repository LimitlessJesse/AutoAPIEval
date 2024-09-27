import javax.swing.plaf.metal.MetalBorders;
import javax.swing.border.Border;

public class MetalBorders_1 {
    public static void main(String[] args) {
        Border buttonBorder = MetalBorders.getButtonBorder();
        System.out.println(buttonBorder);
    }
}
