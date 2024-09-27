import javax.swing.plaf.ColorUIResource;
import javax.swing.plaf.metal.OceanTheme;

public class OceanTheme_1 {
    public static void main(String[] args) {
        OceanTheme oceanTheme = new OceanTheme();
        ColorUIResource primary1 = oceanTheme.getPrimary1();
        System.out.println("Primary1 color: " + primary1);
    }
}
