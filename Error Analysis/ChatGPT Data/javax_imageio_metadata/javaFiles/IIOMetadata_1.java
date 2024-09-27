import javax.imageio.metadata.IIOMetadata;

public class IIOMetadata_1 {
    public static void main(String[] args) {
        IIOMetadata metadata = null; // Initialize the IIOMetadata object
        
        String formatName = metadata.getNativeMetadataFormatName();
        System.out.println("Native metadata format name: " + formatName);
    }
}
