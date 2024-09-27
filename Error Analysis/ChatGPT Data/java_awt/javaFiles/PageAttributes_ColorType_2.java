import java.awt.PageAttributes.ColorType;

public class PageAttributes_ColorType_2 {
    public static void main(String[] args) {
        ColorType colorType = ColorType.CMYK;
        
        int hashCode = colorType.hashCode();
        System.out.println("Hash code of ColorType is: " + hashCode);
    }
}
