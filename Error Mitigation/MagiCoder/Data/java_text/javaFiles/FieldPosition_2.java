import java.text.FieldPosition;

public class FieldPosition_2 {
    public static void main(String[] args) {
        FieldPosition fp = new FieldPosition(0);
        int endIndex = fp.getEndIndex();
        System.out.println("The end index is: " + endIndex);
    }
}
