import javax.management.relation.RelationService;

public class RelationService_2 {
    public static void main(String[] args) {
        RelationService relationService = new RelationService();
        String relationId = "exampleRelation";
        
        // Removing the specified relation
        relationService.removeRelation(relationId);
    }
}
