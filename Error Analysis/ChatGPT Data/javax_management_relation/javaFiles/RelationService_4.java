import javax.management.relation.RelationService;
import java.util.List;

public class RelationService_4 {
    public static void main(String[] args) {
        RelationService relationService = new RelationService();
        List<String> relations = relationService.findRelationsOfType("relationTypeName");
        System.out.println(relations);
    }
}
