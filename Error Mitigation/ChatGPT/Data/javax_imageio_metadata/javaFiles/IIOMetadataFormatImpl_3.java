import javax.imageio.metadata.IIOMetadataFormatImpl;
import java.util.Locale;

public class IIOMetadataFormatImpl_3 {
    public static void main(String[] args) {
        IIOMetadataFormatImpl format = new IIOMetadataFormatImpl();
        String elementName = "exampleElement";
        Locale locale = Locale.getDefault();
        String elementDescription = format.getElementDescription(elementName, locale);
        System.out.println("Element Description: " + elementDescription);
    }
}
