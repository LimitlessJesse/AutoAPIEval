import javax.xml.stream.XMLEventReader;
import javax.xml.stream.util.EventReaderDelegate;

public class EventReaderDelegate_4 {
    public static void main(String[] args) {
        EventReaderDelegate delegate = new EventReaderDelegate() {
            @Override
            public void setParent(XMLEventReader reader) {
                super.setParent(reader);
            }
        };
        
        XMLEventReader parentReader = null; // Initialize parent reader
        
        delegate.setParent(parentReader);
    }
}
