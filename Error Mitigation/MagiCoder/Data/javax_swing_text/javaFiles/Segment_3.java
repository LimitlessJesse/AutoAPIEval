import javax.swing.text.Segment;

public class Segment_3 {
    public static void main(String[] args) {
        Segment segment = new Segment("Hello World");
        char charAtIndex = segment.charAt(5);
        System.out.println(charAtIndex);
    }
}
