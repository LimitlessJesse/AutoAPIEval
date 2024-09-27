import java.awt.GraphicsEnvironment;

public class GraphicsEnvironment_5 {
    public static void main(String[] args) {
        GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
        String[] fontFamilies = ge.getAvailableFontFamilyNames();
        
        System.out.println("Available Font Families:");
        for(String fontFamily : fontFamilies) {
            System.out.println(fontFamily);
        }
    }
}
