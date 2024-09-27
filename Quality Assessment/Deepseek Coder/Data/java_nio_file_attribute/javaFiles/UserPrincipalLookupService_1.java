import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.FileSystems;
import java.io.IOException;

public class UserPrincipalLookupService_1 {
    public static void main(String[] args) {
        try {
            UserPrincipalLookupService lookupService = FileSystems.getDefault().getUserPrincipalLookupService();
            UserPrincipal userPrincipal = lookupService.lookupPrincipalByName("username");
            System.out.println("User Principal: " + userPrincipal.getName());
        } catch (UserPrincipalNotFoundException e) {
            System.out.println("User Principal not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("I/O error: " + e.getMessage());
        }
    }
}
