import javax.management.relation.RelationService;
import javax.management.relation.RelationServiceMBean;
import javax.management.relation.RelationServiceNotRegisteredException;
import javax.management.relation.RelationNotFoundException;

public class RelationService_4 {
    public static void main(String[] args) {
        RelationService relationService = new RelationService();
        String relationId = "exampleRelationId";
        
        try {
            relationService.removeRelation(relationId);
        } catch (RelationServiceNotRegisteredException | IllegalArgumentException | RelationNotFoundException e) {
            e.printStackTrace();
        }
    }
}
