import java.awt.event.ItemEvent;

public class ItemEvent_2 {
    public static void main(String[] args) {
        ItemEvent event = new ItemEvent(null, ItemEvent.ITEM_STATE_CHANGED, null, ItemEvent.SELECTED);
        int stateChange = event.getStateChange();
        System.out.println("State Change: " + stateChange);
    }
}
