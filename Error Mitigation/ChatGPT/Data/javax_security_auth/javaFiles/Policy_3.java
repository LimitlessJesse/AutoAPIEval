import javax.security.auth.Policy;

public class Policy_3 {
    public static void main(String[] args) {
        Policy policy = new Policy() {
            @Override
            public PermissionCollection getPermissions(ProtectionDomain domain) {
                return null;
            }

            @Override
            public void refresh() {
                
            }
        };
        
        Policy.setPolicy(policy);
    }
}
