import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthSeparatorUI_4 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        SynthSeparatorUI ui = new SynthSeparatorUI();
        Dimension preferredSize = ui.getPreferredSize(separator);
        System.out.println("Preferred size: " + preferredSize);
    }
}
