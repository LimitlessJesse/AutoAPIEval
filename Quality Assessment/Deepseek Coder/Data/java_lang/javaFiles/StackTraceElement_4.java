import java.lang.StackTraceElement;

public class StackTraceElement_4 {
    public static void main(String[] args) {
        StackTraceElement element = new StackTraceElement("StackTraceElement_4", "main", "StackTraceElement_4.java", 10);
        System.out.println(element.toString());
    }
}
