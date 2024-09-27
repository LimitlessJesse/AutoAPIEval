import javax.security.auth.kerberos.ServicePermission;

public class ServicePermission_3 {
    public static void main(String[] args) {
        ServicePermission sp1 = new ServicePermission("service1", "connect,listen");
        ServicePermission sp2 = new ServicePermission("service1", "connect,listen");
        ServicePermission sp3 = new ServicePermission("service2", "connect,listen");

        System.out.println(sp1.equals(sp2)); // true
        System.out.println(sp1.equals(sp3)); // false
    }
}
