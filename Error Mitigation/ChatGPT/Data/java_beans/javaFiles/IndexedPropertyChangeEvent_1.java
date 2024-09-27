import java.beans.IndexedPropertyChangeEvent;

public class IndexedPropertyChangeEvent_1 {
    public static void main(String[] args) {
        IndexedPropertyChangeEvent event = new IndexedPropertyChangeEvent(this, "propertyName", null, null, 5);
        int index = event.getIndex();
        System.out.println("Index of the property that was changed: " + index);
    }
}
