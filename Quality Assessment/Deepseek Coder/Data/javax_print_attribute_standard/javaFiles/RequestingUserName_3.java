import javax.print.attribute.standard.RequestingUserName;

public class RequestingUserName_3 {
    public static void main(String[] args) {
        RequestingUserName requestingUserName1 = new RequestingUserName("user1", "password1");
        RequestingUserName requestingUserName2 = new RequestingUserName("user1", "password1");

        boolean isEqual = requestingUserName1.equals(requestingUserName2);
        System.out.println(isEqual);
    }
}
