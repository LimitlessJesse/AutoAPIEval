import javax.swing.UIManager;

public class UIManager_5 {
    public static void main(String[] args) {
        installLookAndFeel("Metal", "javax.swing.plaf.metal.MetalLookAndFeel");
    }

    public static void installLookAndFeel(String name, String className) {
        try {
            UIManager.setLookAndFeel(className);
            UIManager.put("swing.plaf", className);
        } catch (Exception e) {
            System.out.println("Error installing look and feel: " + e.getMessage());
        }
    }
}
