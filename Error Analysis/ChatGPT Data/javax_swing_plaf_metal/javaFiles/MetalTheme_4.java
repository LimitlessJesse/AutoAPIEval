import javax.swing.*;
import javax.swing.plaf.metal.MetalTheme;
import javax.swing.plaf.metal.DefaultMetalTheme;
import javax.swing.plaf.synth.*;

public class MetalTheme_4 {
    public static void main(String[] args) {
        MetalTheme theme = new DefaultMetalTheme();
        addCustomEntriesToTable(theme);
        
        UIDefaults table = new UIDefaults();
        table.put("myCustomEntry", "customValue");
        
        System.out.println(table.getString("myCustomEntry"));
    }

    public static void addCustomEntriesToTable(UIDefaults table) {
        table.put("myCustomEntry", "myCustomValue");
    }
}
