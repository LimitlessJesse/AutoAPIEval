import javax.print.attribute.standard.RequestingUserName;

public class RequestingUserName_4 {
    public static void main(String[] args) {
        RequestingUserName requestingUserName1 = new RequestingUserName("user1", null);
        RequestingUserName requestingUserName2 = new RequestingUserName("user2", null);

        System.out.println(requestingUserName1.equals(requestingUserName2));
    }
}
