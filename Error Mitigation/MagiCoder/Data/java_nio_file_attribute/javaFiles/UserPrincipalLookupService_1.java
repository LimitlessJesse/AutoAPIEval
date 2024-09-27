import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.nio.file.attribute.UserPrincipalLookupService;
import java.io.IOException;

public class UserPrincipalLookupService_1 {
    public static void main(String[] args) {
        UserPrincipalLookupService lookupService = null; // initialize your lookupService
        try {
            lookupService.lookupPrincipalByName("username");
        } catch (UserPrincipalNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
