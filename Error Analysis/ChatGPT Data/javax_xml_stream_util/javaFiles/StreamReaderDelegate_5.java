import javax.xml.stream.XMLStreamReader;
import javax.xml.stream.util.StreamReaderDelegate;

public class StreamReaderDelegate_5 {
    public static void main(String[] args) {
        XMLStreamReader reader = null; // Initialize XMLStreamReader object

        StreamReaderDelegate delegate = new StreamReaderDelegate(reader) {
            @Override
            public boolean hasNext() {
                return super.hasNext(); // Call hasNext() method from the superclass
            }
        };

        // Use delegate.hasNext() in your code logic
    }
}
