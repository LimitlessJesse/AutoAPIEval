import javax.swing.*;
import javax.swing.plaf.synth.*;

public class MyViewport extends JViewport {
    private SynthViewportUI viewportUI;

    public MyViewport() {
        viewportUI = (SynthViewportUI)UIManager.getUI(this);
    }

    @Override
    public void updateUI() {
        if (isLightWeight()) {
            setUI(new SynthViewportUI());
        }
        super.updateUI();
    }

    @Override
    public void update(Graphics g) {
        viewportUI.update(g, this);
    }
}
