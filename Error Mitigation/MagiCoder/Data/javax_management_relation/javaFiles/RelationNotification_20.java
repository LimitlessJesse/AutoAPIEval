import javax.management.relation.RelationNotification;

public class RelationNotification_20 {
    public static void main(String[] args) {
        RelationNotification notification = new RelationNotification(RelationNotification.RELATION_CHANGE, "Relation changed", "Relation ID");
        String relationId = notification.getRelationId();
        System.out.println("Relation ID: " + relationId);
    }
}
