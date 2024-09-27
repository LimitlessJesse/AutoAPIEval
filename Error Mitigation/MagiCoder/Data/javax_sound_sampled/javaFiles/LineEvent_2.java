import javax.sound.sampled.*;

public class LineEvent_2 {
    public static void main(String[] args) {
        LineEvent event = new LineEvent(null, 0, 0, 0, null);
        Line line = event.getLine();
        System.out.println(line);
    }
}
