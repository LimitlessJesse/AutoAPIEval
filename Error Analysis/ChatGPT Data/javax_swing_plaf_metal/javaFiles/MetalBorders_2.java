import javax.swing.plaf.metal.MetalBorders;
import javax.swing.border.Border;

public class MetalBorders_2 {
    public static void main(String[] args) {
        Border desktopIconBorder = MetalBorders.getDesktopIconBorder();
        System.out.println(desktopIconBorder);
    }
}
