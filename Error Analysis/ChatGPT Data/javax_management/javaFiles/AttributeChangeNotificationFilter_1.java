import javax.management.AttributeChangeNotificationFilter;

public class AttributeChangeNotificationFilter_1 {
    public static void main(String[] args) {
        AttributeChangeNotificationFilter filter = new AttributeChangeNotificationFilter();
        filter.enableAttribute("attributeName");
    }
}
