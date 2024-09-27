import javax.imageio.metadata.IIOMetadata;

public class IIOMetadata_4 {
    public static void main(String[] args) {
        IIOMetadata metadata = new IIOMetadata() {
            @Override
            public void reset() {
                // Reset all data to default values
            }
        };
        
        metadata.reset();
    }
}
