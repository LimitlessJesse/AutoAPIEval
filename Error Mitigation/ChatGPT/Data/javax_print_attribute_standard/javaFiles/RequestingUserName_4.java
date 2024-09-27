import javax.print.attribute.standard.RequestingUserName;

public class RequestingUserName_4 {
    public static void main(String[] args) {
        RequestingUserName requestingUserName = new RequestingUserName("John Doe");
        Class<? extends Attribute> category = requestingUserName.getCategory();
        System.out.println("Category: " + category.getName());
    }
}
