import java.awt.PageAttributes;

public class PageAttributes_ColorType_4 {
    public static void main(String[] args) {
        PageAttributes.ColorType colorType = PageAttributes.ColorType.BLACK;
        String colorTypeString = colorType.toString();
        
        System.out.println("Color Type: " + colorTypeString);
    }
}
