import javax.management.relation.RoleInfo;
import javax.management.relation.RelationTypeSupport;

public class RelationTypeSupport_4 {
    public static void main(String[] args) {
        RelationTypeSupport relationTypeSupport = new RelationTypeSupport("ExampleType");
        RoleInfo roleInfo = new RoleInfo("RoleName", "RoleDescription");
        
        relationTypeSupport.addRoleInfo(roleInfo);
    }
}
