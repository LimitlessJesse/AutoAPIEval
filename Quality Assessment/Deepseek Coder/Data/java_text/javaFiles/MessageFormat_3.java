import java.text.MessageFormat;
import java.text.FieldPosition;

public class MessageFormat_3 {
    public static void main(String[] args) {
        String pattern = "boolean add(E e)";
        Object[] arguments = {"E e"};
        StringBuffer buf = new StringBuffer();
        FieldPosition pos = new FieldPosition(0);
        MessageFormat.format(pattern, arguments, buf, pos);
        System.out.println(buf.toString());
    }
}
