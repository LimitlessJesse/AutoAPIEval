import java.security.Policy;

public class Policy_1 {
    public static void main(String[] args) {
        Policy policy = Policy.getPolicy();
        policy.refresh();
    }
}
