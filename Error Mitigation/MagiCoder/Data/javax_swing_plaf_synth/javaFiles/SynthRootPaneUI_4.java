import javax.swing.*;
import javax.swing.plaf.synth.*;

public class CustomRootPane extends JRootPane {
    private SynthRootPaneUI ui;

    public CustomRootPane() {
        ui = new SynthRootPaneUI();
        setUI(ui);
    }

    public void updateUI() {
        super.updateUI();
        ui.installUI(this);
    }

    //... other methods...
}
