import javax.imageio.metadata.IIOMetadata;

public class IIOMetadata_5 {
    public static void main(String[] args) {
        IIOMetadata metadata = null; // Initialize IIOMetadata object
        boolean readOnly = metadata.isReadOnly();
        System.out.println("Is read only: " + readOnly);
    }
}
