import java.text.FieldPosition;

public class FieldPosition_3 {
    public static void main(String[] args) {
        FieldPosition fieldPosition = new FieldPosition(0);
        fieldPosition.setEndIndex(5);
        System.out.println(fieldPosition.getEndIndex());
    }
}
