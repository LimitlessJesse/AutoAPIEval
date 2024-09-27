import javax.security.auth.kerberos.ServicePermission;

public class ServicePermission_2 {
    public static void main(String[] args) {
        ServicePermission permission1 = new ServicePermission("service1", "actions1");
        ServicePermission permission2 = new ServicePermission("service1", "actions1");

        boolean isEqual = permission1.equals(permission2);

        System.out.println("Are the two permissions equal? " + isEqual);
    }
}
