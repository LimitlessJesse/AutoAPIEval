import javax.sound.sampled.Line;
import javax.sound.sampled.LineEvent;

public class LineEvent_2 {
    public static void main(String[] args) {
        LineEvent event = new LineEvent(new Line() {
            @Override
            public void open() {
                System.out.println("Line opened");
            }

            @Override
            public void close() {
                System.out.println("Line closed");
            }

            @Override
            public void start() {
                System.out.println("Line started");
            }

            @Override
            public void stop() {
                System.out.println("Line stopped");
            }
        }, LineEvent.Type.OPEN);

        Line line = event.getLine();
        System.out.println("Line responsible for this event: " + line.toString());
    }
}
