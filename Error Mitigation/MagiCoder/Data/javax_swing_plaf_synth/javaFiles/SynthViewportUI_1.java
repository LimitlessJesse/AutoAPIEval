import javax.swing.*;
import javax.swing.plaf.synth.SynthViewportUI;

public class SynthViewportUI_1 {
    public static void main(String[] args) {
        JViewport viewport = new JViewport();
        SynthViewportUI synthViewportUI = new SynthViewportUI();
        synthViewportUI.installUI(viewport);
    }
}
