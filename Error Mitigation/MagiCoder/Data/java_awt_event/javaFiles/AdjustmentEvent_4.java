import java.awt.event.AdjustmentEvent;

public class AdjustmentEvent_4 {
    public static void main(String[] args) {
        AdjustmentEvent event = new AdjustmentEvent(null, AdjustmentEvent.ADJUSTMENT_PERFORMED, 50);
        int value = event.getValue();
        System.out.println("Value: " + value);
    }
}
