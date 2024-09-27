import java.beans.IndexedPropertyChangeEvent;

public class IndexedPropertyChangeEvent_1 {
    public static void main(String[] args) {
        // Create a new IndexedPropertyChangeEvent
        IndexedPropertyChangeEvent event = new IndexedPropertyChangeEvent(
            new Object(), "propertyName", 0, "oldValue", "newValue");

        // Get the index of the property that was changed
        int index = event.getIndex();

        // Print the index
        System.out.println("Index: " + index);
    }
}
