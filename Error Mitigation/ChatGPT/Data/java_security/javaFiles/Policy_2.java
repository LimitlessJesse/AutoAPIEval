import java.security.Policy;

public class Policy_2 {
    public static void main(String[] args) {
        Policy policy = Policy.getPolicy();
        policy.refresh();
    }
}
