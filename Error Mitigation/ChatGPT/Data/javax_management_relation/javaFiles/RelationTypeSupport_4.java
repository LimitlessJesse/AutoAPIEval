import javax.management.relation.RoleInfo;
import javax.management.relation.RoleInfoNotFoundException;
import javax.management.relation.RelationTypeSupport;

public class RelationTypeSupport_4 {
    public static void main(String[] args) {
        RelationTypeSupport relationTypeSupport = new RelationTypeSupport("ExampleRelationType");
        
        try {
            RoleInfo roleInfo = relationTypeSupport.getRoleInfo("ExampleRole");
            System.out.println("Role Info Name: " + roleInfo.getName());
            System.out.println("Role Info Description: " + roleInfo.getDescription());
        } catch (IllegalArgumentException | RoleInfoNotFoundException e) {
            e.printStackTrace();
        }
    }
}
