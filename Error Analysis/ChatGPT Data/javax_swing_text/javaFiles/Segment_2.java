import javax.swing.text.Segment;

public class Segment_2 {
    public static void main(String[] args) {
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        Segment segment = new Segment(data, 0, data.length);
        char lastChar = segment.last();
        System.out.println("Last character: " + lastChar);
    }
}
