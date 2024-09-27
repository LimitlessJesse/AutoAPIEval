import javax.security.auth.kerberos.ServicePermission;

public class ServicePermission_5 {
    public static void main(String[] args) {
        ServicePermission permission = new ServicePermission("service", "initiate,accept");
        System.out.println(permission.getActions());
    }
}
