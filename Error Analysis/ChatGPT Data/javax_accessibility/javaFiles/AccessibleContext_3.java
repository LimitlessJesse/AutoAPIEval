import javax.accessibility.AccessibleContext;

public class AccessibleContext_3 {
    public static void main(String[] args) {
        AccessibleContext context = new AccessibleContext();
        AccessibleRole role = context.getAccessibleRole();
        System.out.println("Accessible Role: " + role);
    }
}
