import javax.management.relation.RoleInfo;

public class RoleInfo_1 {
    public static void main(String[] args) {
        RoleInfo roleInfo = new RoleInfo("roleName");
        String roleName = roleInfo.getName();
        System.out.println("Role Name: " + roleName);
    }
}
