import java.security.BasicPermission;

public class BasicPermission_4 {
    public static void main(String[] args) {
        BasicPermission permission = new BasicPermission("test") {
            // Implementing the hashCode method
            @Override
            public int hashCode() {
                return getName().hashCode();
            }
        };
        
        // Getting the hash code value for the permission object
        int hashCodeValue = permission.hashCode();
        System.out.println("Hash code value: " + hashCodeValue);
    }
}
