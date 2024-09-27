import javax.management.relation.RelationNotification;

public class RelationNotification_3 {
    public static void main(String[] args) {
        RelationNotification notification = new RelationNotification("relationType", this, 1, System.currentTimeMillis(), "Notification message", "relationTypeName");
        String relationTypeName = notification.getRelationTypeName();
        System.out.println("Relation Type Name: " + relationTypeName);
    }
}
