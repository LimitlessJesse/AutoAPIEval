import javax.management.relation.RelationNotification;

public class RelationNotification_5 {
    public static void main(String[] args) {
        RelationNotification notification = new RelationNotification("notificationType", "source", 1, "sequenceNumber", "message", "relationId", "relationTypeName");
        String relationTypeName = notification.getRelationTypeName();
        System.out.println("Relation Type Name: " + relationTypeName);
    }
}
