import javax.sound.sampled.*;

public class LineEvent_3 {
    public static void main(String[] args) {
        LineEvent event = new LineEvent(null, 0, 0, 0, null);
        long framePosition = event.getFramePosition();
        System.out.println("Frame position: " + framePosition);
    }
}
