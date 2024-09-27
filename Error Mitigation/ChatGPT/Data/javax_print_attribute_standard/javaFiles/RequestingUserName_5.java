import javax.print.attribute.standard.RequestingUserName;

public class RequestingUserName_5 {
    public static void main(String[] args) {
        RequestingUserName requestingUserName = new RequestingUserName("John Doe");
        String categoryName = requestingUserName.getName();
        System.out.println("Category Name: " + categoryName);
    }
}
