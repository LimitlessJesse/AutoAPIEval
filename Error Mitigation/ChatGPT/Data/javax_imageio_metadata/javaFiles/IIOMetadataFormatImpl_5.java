import javax.imageio.metadata.IIOMetadataFormatImpl;

public class IIOMetadataFormatImpl_5 {
    public static void main(String[] args) {
        IIOMetadataFormatImpl format = new IIOMetadataFormatImpl();
        String elementName = "exampleElement";
        String[] attributeNames = format.getAttributeNames(elementName);
        
        for (String attributeName : attributeNames) {
            System.out.println(attributeName);
        }
    }
}
