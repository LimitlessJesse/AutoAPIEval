import javax.security.auth.kerberos.ServicePermission;

public class ServicePermission_4 {
    public static void main(String[] args) {
        ServicePermission servicePermission = new ServicePermission("serviceName", "actions");
        int hashCode = servicePermission.hashCode();
        System.out.println("Hash code: " + hashCode);
    }
}
