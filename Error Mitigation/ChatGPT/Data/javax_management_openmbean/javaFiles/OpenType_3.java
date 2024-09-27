import javax.management.openmbean.OpenType;

public class OpenType_3 {
    public static void main(String[] args) {
        OpenType openType = // initialize OpenType object here
        Object obj = // initialize object to be tested here
        boolean isValid = openType.isValue(obj);
        System.out.println("Is valid value: " + isValid);
    }
}
