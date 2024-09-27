import javax.xml.stream.XMLEventReader;
import javax.xml.stream.util.EventReaderDelegate;

public class EventReaderDelegate_5 {
    public static void main(String[] args) {
        EventReaderDelegate delegate = new EventReaderDelegate() {
            @Override
            public void setParent(XMLEventReader reader) {
                super.setParent(reader);
            }
        };
        
        XMLEventReader parentReader = null; // Initialize your parent XMLEventReader here
        
        delegate.setParent(parentReader);
    }
}
