import javax.management.AttributeChangeNotification;

public class AttributeChangeNotification_2 {
    public static void main(String[] args) {
        AttributeChangeNotification notification = new AttributeChangeNotification(
                this, 1, System.currentTimeMillis(), "Attribute changed", "attributeName", "attributeType", "oldValue", "newValue");
        
        Object oldValue = notification.getOldValue();
        System.out.println("Old value: " + oldValue);
    }
}
