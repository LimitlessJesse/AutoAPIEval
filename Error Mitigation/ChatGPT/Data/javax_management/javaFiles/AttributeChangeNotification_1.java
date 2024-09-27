import javax.management.AttributeChangeNotification;

public class AttributeChangeNotification_1 {
    public static void main(String[] args) {
        AttributeChangeNotification notification = new AttributeChangeNotification("source", 1, System.currentTimeMillis(), "Attribute has changed", "attributeName", "oldValue", "newValue");
        String attributeName = notification.getAttributeName();
        System.out.println("Attribute Name: " + attributeName);
    }
}
