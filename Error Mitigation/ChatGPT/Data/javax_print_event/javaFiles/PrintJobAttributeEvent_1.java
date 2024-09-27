import javax.print.attribute.PrintJobAttributeSet;
import javax.print.event.PrintJobAttributeEvent;

public class PrintJobAttributeEvent_1 {
    public static void main(String[] args) {
        PrintJobAttributeEvent event = new PrintJobAttributeEvent(null, null);
        PrintJobAttributeSet attributes = event.getAttributes();
        System.out.println(attributes);
    }
}
