import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineListener;

public class LineEvent_1 {
    public static void main(String[] args) {
        LineListener listener = new LineListener() {
            @Override
            public void update(LineEvent event) {
                if (event.getType() == LineEvent.Type.OPEN) {
                    System.out.println("Line opened");
                } else if (event.getType() == LineEvent.Type.CLOSE) {
                    System.out.println("Line closed");
                }
            }
        };
    }
}
