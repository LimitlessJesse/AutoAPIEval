import javax.management.AttributeChangeNotification;

public class AttributeChangeNotification_3 {
    public static void main(String[] args) {
        AttributeChangeNotification notification = new AttributeChangeNotification(
                this, 1, System.currentTimeMillis(), "Attribute changed", "attributeName", "attributeType", "oldValue", "newValue");
        
        Object newValue = notification.getNewValue();
        System.out.println("New value: " + newValue);
    }
}
