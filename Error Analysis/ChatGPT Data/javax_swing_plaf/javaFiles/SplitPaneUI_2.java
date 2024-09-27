import javax.swing.*;

public class SplitPaneUI_2 {
    public static void main(String[] args) {
        JSplitPane jc = new JSplitPane();
        Graphics g = jc.getGraphics();
        
        // Call the finishedPaintingChildren method
        finishedPaintingChildren(jc, g);
    }
    
    private static void finishedPaintingChildren(JSplitPane jc, Graphics g) {
        javax.swing.plaf.SplitPaneUI ui = jc.getUI();
        ui.finishedPaintingChildren(jc, g);
    }
}
