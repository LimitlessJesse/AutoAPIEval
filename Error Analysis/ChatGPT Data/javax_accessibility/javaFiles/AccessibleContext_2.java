import javax.accessibility.AccessibleContext;

public class AccessibleContext_2 {
    public static void main(String[] args) {
        AccessibleContext accessibleContext = new AccessibleContext();
        int indexInParent = accessibleContext.getAccessibleIndexInParent();
        System.out.println("Index in parent: " + indexInParent);
    }
}
