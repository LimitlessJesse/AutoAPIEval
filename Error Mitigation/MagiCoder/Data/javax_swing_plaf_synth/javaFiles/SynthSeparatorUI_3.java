import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthSeparatorUI_3 {
    public static void main(String[] args) {
        JSeparator separator = new JSeparator();
        SynthSeparatorUI ui = new SynthSeparatorUI();
        ui.paint(separator.getGraphics(), separator);
    }
}
