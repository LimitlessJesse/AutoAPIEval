import javax.swing.JComponent;
import javax.swing.plaf.synth.SynthContext;
import javax.swing.plaf.synth.SynthLookAndFeel;
import javax.swing.plaf.synth.SynthToolBarUI;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JToolBar;

public class SynthToolBarUI_3 {
    public static void main(String[] args) {
        // Create a JFrame
        JFrame frame = new JFrame("SynthContext Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create a JToolBar with a button
        JToolBar toolBar = new JToolBar();
        JButton button = new JButton("Click me");
        toolBar.add(button);
        
        // Get the SynthToolBarUI instance
        SynthToolBarUI ui = new SynthToolBarUI();
        
        // Get the SynthContext for the JToolBar
        SynthContext context = ui.getContext(toolBar);
        
        // Print the context information
        System.out.println("State: " + context.getComponentState());
        System.out.println("Region: " + context.getRegion());
        System.out.println("Style: " + context.getStyle());
        
        frame.add(toolBar);
        frame.pack();
        frame.setVisible(true);
    }
}
