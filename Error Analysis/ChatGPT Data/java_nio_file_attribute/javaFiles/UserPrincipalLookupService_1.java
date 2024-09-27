import java.nio.file.FileSystems;
import java.nio.file.attribute.UserPrincipal;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.io.IOException;

public class UserPrincipalLookupService_1 {
    public static void main(String[] args) {
        String username = "john_doe"; // Example username
        try {
            UserPrincipalLookupService lookupService = FileSystems.getDefault().getUserPrincipalLookupService();
            UserPrincipal userPrincipal = lookupService.lookupPrincipalByName(username);
            System.out.println("UserPrincipal for username '" + username + "': " + userPrincipal.toString());
        } catch (UserPrincipalNotFoundException e) {
            System.out.println("UserPrincipal not found for username: " + username);
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        }
    }
}
