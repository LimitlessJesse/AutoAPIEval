import javax.swing.text.Segment;

public class Segment_4 {
    public static void main(String[] args) {
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        Segment segment = new Segment(data, 0, 5);
        String text = segment.toString();
        System.out.println(text);
    }
}
