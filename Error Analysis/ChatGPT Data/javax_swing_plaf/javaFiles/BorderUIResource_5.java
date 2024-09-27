import javax.swing.plaf.BorderUIResource;

public class BorderUIResource_5 {
    public static void main(String[] args) {
        BorderUIResource border = new BorderUIResource();
        boolean isOpaque = border.isBorderOpaque();
        System.out.println("Border is opaque: " + isOpaque);
    }
}
