import javax.management.relation.RoleInfo;

public class RoleInfo_3 {
    public static void main(String[] args) {
        RoleInfo roleInfo = new RoleInfo("roleName", new String[]{"MBeanClassName1", "MBeanClassName2"});
        boolean isWritable = roleInfo.isWritable();
        System.out.println("Is Writable: " + isWritable);
    }
}
