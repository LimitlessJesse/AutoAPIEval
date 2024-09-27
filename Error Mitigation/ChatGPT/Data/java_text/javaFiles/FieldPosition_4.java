import java.text.FieldPosition;

public class FieldPosition_4 {
    public static void main(String[] args) {
        FieldPosition fieldPosition = new FieldPosition(0);
        fieldPosition.setBeginIndex(5);
        System.out.println("Begin index set to: " + fieldPosition.getBeginIndex());
    }
}
