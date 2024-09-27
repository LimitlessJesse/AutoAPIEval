import javax.swing.ImageIcon;

public class ImageIcon_8 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("path_to_your_image.jpg");
        int width = icon.getIconWidth();
        System.out.println("Width of the image: " + width);
    }
}
