import java.text.FieldPosition;

public class FieldPosition_4 {
    public static void main(String[] args) {
        FieldPosition fieldPosition = new FieldPosition(0);
        int endIndex = fieldPosition.getEndIndex();
        System.out.println("End index: " + endIndex);
    }
}
