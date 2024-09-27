import javax.swing.plaf.synth.SynthScrollBarUI;

public class SynthScrollBarUI_1 {
    public static void main(String[] args) {
        SynthScrollBarUI ui = new SynthScrollBarUI();
        boolean supportsAbsolutePositioning = ui.getSupportsAbsolutePositioning();
        System.out.println("Supports Absolute Positioning: " + supportsAbsolutePositioning);
    }
}
