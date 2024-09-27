import javax.sound.sampled.LineEvent;

public class LineEvent_3 {
    public static void main(String[] args) {
        LineEvent lineEvent = new LineEvent(null, LineEvent.Type.START, 100); // Creating a LineEvent with position at 100 sample frames
        long framePosition = lineEvent.getFramePosition();
        System.out.println("Frame Position: " + framePosition);
    }
}
