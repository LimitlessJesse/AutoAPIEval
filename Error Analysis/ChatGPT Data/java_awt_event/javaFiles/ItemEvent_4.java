import java.awt.event.ItemEvent;

public class ItemEvent_4 {
    public static void main(String[] args) {
        ItemEvent event = new ItemEvent(null, ItemEvent.ITEM_STATE_CHANGED, "source", ItemEvent.SELECTED);
        System.out.println(event.paramString());
    }
}
