import java.awt.event.ItemEvent;

public class ItemEvent_4 {
    public static void main(String[] args) {
        ItemEvent event = new ItemEvent(null, 0, 0, 0, true);
        int stateChange = event.getStateChange();
        System.out.println("State Change: " + stateChange);
    }
}
