import javax.sound.sampled.LineEvent;

public class LineEvent_Type_2 {
    public static void main(String[] args) {
        LineEvent.Type event = LineEvent.Type.OPEN;
        String result = event.toString();
        System.out.println("LineEvent Type: " + result);
    }
}
