import java.text.FieldPosition;

public class FieldPosition_1 {
    public static void main(String[] args) {
        FieldPosition fp = new FieldPosition(0);
        int beginIndex = fp.getBeginIndex();
        System.out.println("The begin index is: " + beginIndex);
    }
}
