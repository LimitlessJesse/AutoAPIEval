import javax.swing.*;
import javax.swing.plaf.synth.*;

public class SynthButtonUI_5 {
    public static void main(String[] args) {
        JButton button = new JButton("Click me");
        SynthButtonUI ui = new SynthButtonUI();
        ui.update(button.getGraphics(), button);
    }
}
