import javax.swing.ImageIcon;

public class ImageIcon_2 {
    public static void main(String[] args) {
        // Creating an ImageIcon object
        ImageIcon icon = new ImageIcon("image.png");

        // Getting the width of the icon
        int width = icon.getIconWidth();
        System.out.println("Icon width: " + width);
    }
}
