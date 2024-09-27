import javax.swing.text.Segment;

public class Segment_1 {
    public static void main(String[] args) {
        char[] data = {'H', 'e', 'l', 'l', 'o'};
        Segment segment = new Segment(data, 0, data.length);
        
        char result = segment.charAt(1);
        System.out.println("Character at index 1: " + result);
    }
}
