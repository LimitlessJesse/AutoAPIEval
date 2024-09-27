import javax.security.auth.Policy;

public class Policy_4 {
    public static void main(String[] args) {
        Policy policy = Policy.getPolicy();
        policy.refresh();
    }
}
