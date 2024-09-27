import javax.swing.text.Segment;

public class Segment_1 {
    public static void main(String[] args) {
        Segment segment = new Segment("Hello", 0, 5);
        char firstChar = segment.first();
        System.out.println("First character: " + firstChar);
    }
}
