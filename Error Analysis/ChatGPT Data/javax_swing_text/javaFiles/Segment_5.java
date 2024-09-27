import javax.swing.text.Segment;

public class Segment_5 {
    public static void main(String[] args) {
        Segment segment = new Segment();
        segment.array = "Hello".toCharArray();
        segment.offset = 0;
        segment.count = 5;
        
        char result = segment.charAt(1);
        System.out.println("Character at index 1: " + result);
    }
}
