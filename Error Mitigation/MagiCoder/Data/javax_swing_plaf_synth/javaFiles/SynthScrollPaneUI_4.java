import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class SynthScrollPaneUI_4 {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        JScrollPane scrollPane = new JScrollPane();
        SynthScrollPaneUI ui = new SynthScrollPaneUI();
        ui.update(frame.getGraphics(), scrollPane);
    }
}
