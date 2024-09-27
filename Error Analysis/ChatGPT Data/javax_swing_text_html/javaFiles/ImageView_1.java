import javax.swing.text.html.ImageView;

public class ImageView_1 {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(null);
        java.awt.Image image = imageView.getImage();
        System.out.println(image);
    }
}
