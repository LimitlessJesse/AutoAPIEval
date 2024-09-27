import javax.swing.event.EventListenerList;

public class EventListenerList_5 {
    public static void main(String[] args) {
        EventListenerList listenerList = new EventListenerList();
        
        // Add some listeners to the EventListenerList
        
        int count = listenerList.getListenerCount();
        System.out.println("Number of listeners: " + count);
    }
}
