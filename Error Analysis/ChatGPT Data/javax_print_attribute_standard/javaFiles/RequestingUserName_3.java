import javax.print.attribute.standard.RequestingUserName;

public class RequestingUserName_3 {
    public static void main(String[] args) {
        RequestingUserName userName = new RequestingUserName("John Doe");
        String name = userName.getName();
        System.out.println("Requesting user name: " + name);
    }
}
