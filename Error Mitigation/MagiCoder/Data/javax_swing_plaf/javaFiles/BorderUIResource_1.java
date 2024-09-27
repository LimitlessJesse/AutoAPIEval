import javax.swing.plaf.BorderUIResource;

public class BorderUIResource_1 {
    public static void main(String[] args) {
        BorderUIResource border = new BorderUIResource();
        boolean isOpaque = border.isBorderOpaque();
        System.out.println("Is border opaque? " + isOpaque);
    }
}
