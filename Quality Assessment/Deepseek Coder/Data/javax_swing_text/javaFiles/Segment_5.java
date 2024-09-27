import javax.swing.text.Segment;

public class Segment_5 {
    public static void main(String[] args) {
        Segment segment = new Segment();
        segment.array = new char[10];
        segment.count = 5;
        
        int length = segment.length();
        System.out.println("Length of the segment: " + length);
    }
}
