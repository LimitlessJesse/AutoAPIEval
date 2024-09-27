import javax.swing.plaf.metal.MetalTabbedPaneUI;

public class MetalTabbedPaneUI_4 {
    public static void main(String[] args) {
        MetalTabbedPaneUI ui = new MetalTabbedPaneUI();
        int tabPlacement = MetalTabbedPaneUI.NORTH;
        int maxTabHeight = ui.calculateMaxTabHeight(tabPlacement);
        System.out.println("Max tab height for tab placement " + tabPlacement + " is: " + maxTabHeight);
    }
}
