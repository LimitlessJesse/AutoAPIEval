import javax.swing.plaf.IconUIResource;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class IconUIResource_2 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("path_to_your_image.png");
        JLabel label = new JLabel(icon);
        IconUIResource iconUIResource = (IconUIResource) label.getIcon();
        int width = iconUIResource.getIconWidth();
        System.out.println("The width of the icon is: " + width);
    }
}
