import javax.management.AttributeChangeNotificationFilter;

public class AttributeChangeNotificationFilter_2 {
    public static void main(String[] args) {
        AttributeChangeNotificationFilter filter = new AttributeChangeNotificationFilter();
        filter.disableAttribute("attributeName");
    }
}
