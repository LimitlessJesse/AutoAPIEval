import java.security.PermissionCollection;

public class PermissionCollection_4 {
    public static void main(String[] args) {
        PermissionCollection permissionCollection = new PermissionCollection() {
            @Override
            public void add(java.security.Permission permission) {
                // implementation of add method
            }

            @Override
            public boolean implies(java.security.Permission permission) {
                // implementation of implies method
                return false;
            }

            @Override
            public java.util.Enumeration<java.security.Permission> elements() {
                // implementation of elements method
                return null;
            }

            @Override
            public void setReadOnly() {
                // implementation of setReadOnly method
            }
        };

        permissionCollection.setReadOnly();
    }
}
