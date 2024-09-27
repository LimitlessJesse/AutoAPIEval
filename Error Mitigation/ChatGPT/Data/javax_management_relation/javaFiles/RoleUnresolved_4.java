import javax.management.relation.RoleUnresolved;

public class RoleUnresolved_4 {
    public static void main(String[] args) {
        RoleUnresolved roleUnresolved = new RoleUnresolved();
        try {
            roleUnresolved.setRoleName("exampleRole");
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
