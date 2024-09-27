import javax.security.auth.kerberos.ServicePermission;

public class ServicePermission_2 {
    public static void main(String[] args) {
        ServicePermission servicePermission = new ServicePermission("krbtgt/EXAMPLE.COM@EXAMPLE.COM", "initiate, accept");
        String actions = servicePermission.getActions();
        System.out.println("Actions: " + actions);
    }
}
