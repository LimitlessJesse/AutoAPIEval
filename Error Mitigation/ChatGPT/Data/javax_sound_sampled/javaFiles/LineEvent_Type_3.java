import javax.sound.sampled.LineEvent;

public class LineEvent_Type_3 {
    public static void main(String[] args) {
        LineEvent.Type type1 = LineEvent.Type.OPEN;
        LineEvent.Type type2 = LineEvent.Type.CLOSE;
        
        boolean result1 = type1.equals(type2);
        System.out.println("Are type1 and type2 equal? " + result1); // Output: Are type1 and type2 equal? false
        
        LineEvent.Type type3 = LineEvent.Type.OPEN;
        boolean result2 = type1.equals(type3);
        System.out.println("Are type1 and type3 equal? " + result2); // Output: Are type1 and type3 equal? true
    }
}
