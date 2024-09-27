import javax.management.AttributeChangeNotification;

public class AttributeChangeNotification_1 {
    public static void main(String[] args) {
        AttributeChangeNotification notification = new AttributeChangeNotification(
                this, 0, System.currentTimeMillis(), "Attribute change", "myAttribute", "java.lang.String", "oldValue", "newValue");

        String attributeName = notification.getAttributeName();
        System.out.println("Attribute name: " + attributeName);
    }
}
