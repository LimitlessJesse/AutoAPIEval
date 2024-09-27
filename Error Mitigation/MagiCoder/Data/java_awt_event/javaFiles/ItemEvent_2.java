import java.awt.event.ItemEvent;

public class ItemEvent_2 {
    public static void main(String[] args) {
        ItemEvent event = new ItemEvent(null, ItemEvent.ITEM_STATE_CHANGED, null, 0, true);
        int stateChange = event.getStateChange();
        System.out.println("State change: " + stateChange);
    }
}
