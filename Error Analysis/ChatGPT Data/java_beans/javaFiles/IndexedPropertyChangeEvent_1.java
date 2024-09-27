import java.beans.IndexedPropertyChangeEvent;

public class IndexedPropertyChangeEvent_1 {
    public static void main(String[] args) {
        IndexedPropertyChangeEvent event = new IndexedPropertyChangeEvent(this, "propertyName", true, 0, "oldValue", "newValue");
        int index = event.getIndex();
        System.out.println("Index: " + index);
    }
}
