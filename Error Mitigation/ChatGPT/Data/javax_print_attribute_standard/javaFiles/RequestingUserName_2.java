import javax.print.attribute.standard.RequestingUserName;

public class RequestingUserName_2 {
    public static void main(String[] args) {
        RequestingUserName userName1 = new RequestingUserName("John Doe");
        RequestingUserName userName2 = new RequestingUserName("Jane Smith");

        System.out.println("Are userName1 and userName2 equal? " + userName1.equals(userName2));
    }
}
