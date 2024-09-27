import javax.management.relation.RelationService;
import javax.management.relation.RoleInfo;

public class RelationService_1 {
    public static void main(String[] args) {
        RelationService relationService = new RelationService();
        String relationTypeName = "SampleRelation";
        RoleInfo[] roleInfos = {new RoleInfo("Role1", "java.lang.String", true, false, 1, 1, "Description")};
        relationService.createRelationType(relationTypeName, roleInfos);
    }
}
