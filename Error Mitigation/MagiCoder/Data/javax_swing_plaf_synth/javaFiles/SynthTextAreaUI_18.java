import javax.swing.*;
import javax.swing.plaf.synth.*;

public class SynthTextAreaUI_18 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea();
        SynthTextAreaUI synthTextAreaUI = new SynthTextAreaUI();
        synthTextAreaUI.update(textArea.getGraphics(), textArea);
    }
}
