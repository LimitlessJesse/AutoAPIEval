import javax.swing.plaf.IconUIResource;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class IconUIResource_3 {
    public static void main(String[] args) {
        // Create an ImageIcon
        ImageIcon icon = new ImageIcon("path_to_your_image.jpg");

        // Create a JLabel with the ImageIcon
        JLabel label = new JLabel(icon);

        // Get the IconUIResource from the JLabel
        IconUIResource iconUIResource = (IconUIResource) label.getIcon();

        // Get the height of the icon
        int iconHeight = iconUIResource.getIconHeight();

        // Print the height of the icon
        System.out.println("The height of the icon is: " + iconHeight);
    }
}
