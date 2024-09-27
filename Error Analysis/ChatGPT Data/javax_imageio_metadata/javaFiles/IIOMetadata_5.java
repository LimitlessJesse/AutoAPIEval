import javax.imageio.metadata.IIOMetadata;

public class IIOMetadata_5 {
    public static void main(String[] args) {
        IIOMetadata metadata = new IIOMetadata() {
            @Override
            public void reset() {
                // Reset all the data in the IIOMetadata object
            }
        };

        metadata.reset();
    }
}
