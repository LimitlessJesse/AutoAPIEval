import javax.management.relation.ObjectName;
import javax.management.relation.RelationNotification;

public class RelationNotification_2 {
    public static void main(String[] args) {
        RelationNotification notification = new RelationNotification("mytype", "source", 1, "message", new ObjectName("domain", "key", "value"));
        ObjectName objectName = notification.getObjectName();
        System.out.println("Object Name: " + objectName);
    }
}
