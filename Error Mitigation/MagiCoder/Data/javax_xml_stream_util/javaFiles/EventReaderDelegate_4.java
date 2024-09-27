import javax.xml.stream.util.EventReaderDelegate;

public class EventReaderDelegate_4 {
    public static void main(String[] args) {
        EventReaderDelegate eventReader = new EventReaderDelegate();
        // Assume we have added some events to the eventReader
        eventReader.add(/* some event */);
        eventReader.add(/* some event */);
        // Now, let's remove the last event
        eventReader.remove();
    }
}
