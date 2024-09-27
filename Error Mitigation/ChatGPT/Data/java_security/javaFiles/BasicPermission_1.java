import java.security.BasicPermission;

public class BasicPermission_1 {
    public static void main(String[] args) {
        BasicPermission permission = new BasicPermission("test") {
            @Override
            public String getActions() {
                return "";
            }
        };
        System.out.println(permission.getActions());
    }
}
