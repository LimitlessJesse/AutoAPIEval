import javax.security.auth.kerberos.ServicePermission;

public class ServicePermission_1 {
    public static void main(String[] args) {
        ServicePermission permission = new ServicePermission("krbtgt/EXAMPLE.COM@EXAMPLE.COM", "initiate");
        boolean implies = permission.implies(new ServicePermission("krbtgt/EXAMPLE.COM@EXAMPLE.COM", "initiate"));
        System.out.println("Permission implies: " + implies);
    }
}
