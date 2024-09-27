import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.io.IOException;

public class UserPrincipalLookupService_1 {
    public static void main(String[] args) {
        UserPrincipalLookupService service = FileSystems.getDefault().getUserPrincipalLookupService();
        
        try {
            UserPrincipal userPrincipal = service.lookupPrincipalByName("username");
            System.out.println("User principal found: " + userPrincipal.toString());
        } catch (UserPrincipalNotFoundException e) {
            System.out.println("User principal not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("An I/O error occurred: " + e.getMessage());
        } catch (SecurityException e) {
            System.out.println("Security exception occurred: " + e.getMessage());
        }
    }
}
