import javax.swing.Icon;
import javax.swing.plaf.IconUIResource;

public class IconUIResource_5 {
    public static void main(String[] args) {
        Icon icon = new IconUIResource() {
            @Override
            public int getIconWidth() {
                return 100; // replace with your actual icon width
            }

            @Override
            public int getIconHeight() {
                return 100; // replace with your actual icon height
            }

            @Override
            public void paintIcon(java.awt.Component c, java.awt.Graphics g, int x, int y) {
                // Implement the painting logic here
            }
        };

        int width = icon.getIconWidth();
        System.out.println("Icon width: " + width);
    }
}
