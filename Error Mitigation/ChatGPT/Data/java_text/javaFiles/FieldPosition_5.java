import java.text.FieldPosition;

public class FieldPosition_5 {
    public static void main(String[] args) {
        FieldPosition fieldPosition = new FieldPosition(0);
        fieldPosition.setEndIndex(5);
        System.out.println("End index set to: " + fieldPosition.getEndIndex());
    }
}
