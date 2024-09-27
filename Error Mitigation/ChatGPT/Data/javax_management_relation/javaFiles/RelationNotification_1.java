import javax.management.relation.RelationNotification;

public class RelationNotification_1 {
    public static void main(String[] args) {
        RelationNotification notification = new RelationNotification("relationType", "source", 1, System.currentTimeMillis(), "message", "relationId");
        String relationId = notification.getRelationId();
        System.out.println("Relation ID: " + relationId);
    }
}
