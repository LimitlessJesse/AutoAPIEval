import javax.sound.sampled.LineEvent;

public class LineEvent_2 {
    public static void main(String[] args) {
        LineEvent event = new LineEvent(new Object(), LineEvent.Type.OPEN);
        LineEvent.Type eventType = event.getType();
        System.out.println("Type of LineEvent: " + eventType);
    }
}
