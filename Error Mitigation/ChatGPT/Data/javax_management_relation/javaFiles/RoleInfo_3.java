import javax.management.relation.RoleInfo;

public class RoleInfo_3 {
    public static void main(String[] args) {
        RoleInfo roleInfo = new RoleInfo("roleName", new String[]{"roleValue1", "roleValue2"});
        boolean isReadable = roleInfo.isReadable();
        System.out.println("Is role readable? " + isReadable);
    }
}
