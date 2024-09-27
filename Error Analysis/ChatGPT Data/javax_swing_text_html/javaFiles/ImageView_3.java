import javax.swing.text.html.ImageView;

public class ImageView_3 {
    public static void main(String[] args) {
        ImageView imageView = new ImageView(null);
        float alignmentX = imageView.getAlignment(ImageView.X_AXIS);
        float alignmentY = imageView.getAlignment(ImageView.Y_AXIS);
        System.out.println("Alignment X: " + alignmentX);
        System.out.println("Alignment Y: " + alignmentY);
    }
}
