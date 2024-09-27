import javax.sound.sampled.LineEvent;

public class LineEvent_1 {
    public static void main(String[] args) {
        LineEvent event = new LineEvent(null, 0, null);
        LineEvent.Type type = event.getType();
        System.out.println("Event type: " + type);
    }
}
