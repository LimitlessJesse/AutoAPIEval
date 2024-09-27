import javax.swing.plaf.synth.SynthTabbedPaneUI;

public class SynthTabbedPaneUI_4 {
    public static void main(String[] args) {
        // Instantiate an object of SynthTabbedPaneUI
        SynthTabbedPaneUI ui = new SynthTabbedPaneUI();
        
        // Call the calculateMaxTabHeight method with a tabPlacement argument and store the result
        int maxTabHeight = ui.calculateMaxTabHeight(SynthTabbedPaneUI.TOP);
        
        // Print the calculated max tab height
        System.out.println("Max Tab Height: " + maxTabHeight);
    }
}
