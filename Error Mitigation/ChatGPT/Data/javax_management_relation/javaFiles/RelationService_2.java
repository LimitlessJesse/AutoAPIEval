import javax.management.relation.RelationService;
import javax.management.relation.RelationServiceMBean;
import javax.management.relation.RelationServiceNotRegisteredException;
import javax.management.relation.RelationTypeNotFoundException;

public class RelationService_2 {
    public static void main(String[] args) {
        RelationService relationService = new RelationService();
        
        try {
            relationService.removeRelationType("exampleRelationType");
        } catch (RelationServiceNotRegisteredException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (RelationTypeNotFoundException e) {
            e.printStackTrace();
        }
    }
}
