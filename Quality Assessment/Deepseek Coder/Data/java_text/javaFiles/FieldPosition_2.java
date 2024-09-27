import java.text.FieldPosition;

public class FieldPosition_2 {
    public static void main(String[] args) {
        FieldPosition fp = new FieldPosition(0);
        fp.setBeginIndex(10);
        fp.setEndIndex(20);
        
        System.out.println("End Index: " + fp.getEndIndex());
    }
}
