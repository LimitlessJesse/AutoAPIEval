import java.awt.event.ItemEvent;

public class ItemEvent_1 {
    public static void main(String[] args) {
        ItemEvent event = new ItemEvent(this, ItemEvent.ITEM_STATE_CHANGED, "Item", ItemEvent.SELECTED);
        Object selectedItem = event.getItem();
        System.out.println("Selected item: " + selectedItem);
    }
}
