import javax.swing.border.AbstractBorder;

public class AbstractBorder_3 {
    public static void main(String[] args) {
        // Create an instance of AbstractBorder
        AbstractBorder border = new AbstractBorder() {
            @Override
            public boolean isBorderOpaque() {
                return true; // Returns true to indicate that the border is opaque
            }
        };
        
        // Call the isBorderOpaque method on the border instance
        boolean isOpaque = border.isBorderOpaque();
        System.out.println("Border is opaque: " + isOpaque);
    }
}
