import javax.imageio.metadata.IIOMetadataFormatImpl;

public class IIOMetadataFormatImpl_4 {
    public static void main(String[] args) {
        IIOMetadataFormatImpl format = new IIOMetadataFormatImpl();
        String elementName = "exampleElement";
        String[] childNames = format.getChildNames(elementName);
        
        if(childNames != null) {
            for(String name : childNames) {
                System.out.println(name);
            }
        } else {
            System.out.println("Element " + elementName + " cannot have children.");
        }
    }
}
