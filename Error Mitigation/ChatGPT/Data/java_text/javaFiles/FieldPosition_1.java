import java.text.FieldPosition;

public class FieldPosition_1 {
    public static void main(String[] args) {
        FieldPosition fieldPosition = new FieldPosition(0);
        int beginIndex = fieldPosition.getBeginIndex();
        System.out.println("Begin Index: " + beginIndex);
    }
}
