import javax.swing.*;
import javax.swing.plaf.synth.*;
import java.awt.*;

public class CustomToolTip extends JToolTip {
    private SynthToolTipUI ui;

    public CustomToolTip() {
        ui = new SynthToolTipUI();
        setUI(ui);
    }

    public void updateUI() {
        super.updateUI();
        ui.installUI(this);
    }

    public void paint(Graphics g) {
        ui.paint(g, this);
    }
}
