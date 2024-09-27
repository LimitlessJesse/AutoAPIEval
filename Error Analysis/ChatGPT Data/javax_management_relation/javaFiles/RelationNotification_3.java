import javax.management.relation.RelationNotification;

public class RelationNotification_3 {
    public static void main(String[] args) {
        RelationNotification notification = new RelationNotification("", null, 0, "", "", "", "");
        String relationId = notification.getRelationId();
        System.out.println("Relation Id: " + relationId);
    }
}
