import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_4 {
    public static void main(String[] args) {
        XMLStreamReader reader = new StreamReaderDelegate() {
            @Override
            public int getAttributeCount() {
                return super.getAttributeCount();
            }
        };
        
        int attributeCount = reader.getAttributeCount();
        System.out.println("Attribute count: " + attributeCount);
    }
}
