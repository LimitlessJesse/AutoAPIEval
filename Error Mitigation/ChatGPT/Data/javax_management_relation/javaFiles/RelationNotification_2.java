import javax.management.ObjectName;
import javax.management.relation.RelationNotification;

public class RelationNotification_2 {
    public static void main(String[] args) {
        RelationNotification notification = new RelationNotification("relationType", "source", 1, System.currentTimeMillis(), "message", "relationId", new ObjectName("domain", "key", "value"));
        ObjectName objectName = notification.getObjectName();
        System.out.println("Object Name: " + objectName);
    }
}
