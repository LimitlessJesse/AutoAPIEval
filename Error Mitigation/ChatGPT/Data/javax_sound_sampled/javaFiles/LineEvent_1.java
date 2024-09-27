import javax.sound.sampled.LineEvent;

public class LineEvent_1 {
    public static void main(String[] args) {
        LineEvent.Type eventType = LineEvent.Type.OPEN;
        LineEvent event = new LineEvent(new Object(), eventType);
        LineEvent.Type type = event.getType();
        System.out.println("Event type: " + type);
    }
}
