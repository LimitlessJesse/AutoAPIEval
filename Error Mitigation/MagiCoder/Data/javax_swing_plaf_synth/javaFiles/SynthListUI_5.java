import javax.swing.*;
import javax.swing.plaf.synth.*;

public class SynthListUI_5 {
    public static void main(String[] args) {
        JList<String> list = new JList<>();
        SynthListUI ui = new SynthListUI();
        ui.update(list.getGraphics(), list);
    }
}
