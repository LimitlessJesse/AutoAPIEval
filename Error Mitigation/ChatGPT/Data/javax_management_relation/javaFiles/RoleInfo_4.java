import javax.management.relation.RoleInfo;

public class RoleInfo_4 {
    public static void main(String[] args) {
        RoleInfo roleInfo = new RoleInfo("roleName", new String[]{"roleValue1", "roleValue2"});
        boolean isWritable = roleInfo.isWritable();
        System.out.println("Is role writable? " + isWritable);
    }
}
