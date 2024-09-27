import javax.management.relation.RelationService;

public class RelationService_5 {
    public static void main(String[] args) {
        RelationService relationService = new RelationService();
        String relationId = "exampleRelation";
        
        boolean hasRelation = relationService.hasRelation(relationId);
        System.out.println("Does relation exist: " + hasRelation);
    }
}
