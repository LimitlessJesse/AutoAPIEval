import javax.management.relation.RoleInfo;
import javax.management.relation.InvalidRelationTypeException;

public class RelationTypeSupport_3 {
    public static void main(String[] args) {
        RoleInfo roleInfo = new RoleInfo("RoleName", "RoleClass");
        RelationTypeSupport relationTypeSupport = new RelationTypeSupport("RelationTypeName", "RelationTypeDesc");
        
        try {
            relationTypeSupport.addRoleInfo(roleInfo);
        } catch (IllegalArgumentException | InvalidRelationTypeException e) {
            e.printStackTrace();
        }
    }
}
