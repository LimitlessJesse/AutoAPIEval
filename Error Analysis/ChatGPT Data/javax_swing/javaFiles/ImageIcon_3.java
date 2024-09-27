import javax.swing.ImageIcon;

public class ImageIcon_3 {
    public static void main(String[] args) {
        ImageIcon icon = new ImageIcon("image.jpg");
        icon.setImageObserver(null);
    }
}
