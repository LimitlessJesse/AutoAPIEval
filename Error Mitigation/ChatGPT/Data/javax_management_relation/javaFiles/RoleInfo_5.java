import javax.management.relation.RoleInfo;

public class RoleInfo_5 {
    public static void main(String[] args) {
        RoleInfo roleInfo = new RoleInfo("roleName", new String[]{"roleValue1", "roleValue2"});
        System.out.println(roleInfo.toString());
    }
}
