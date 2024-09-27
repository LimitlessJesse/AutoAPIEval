import javax.activation.MimeTypeParameterList;

public class MimeTypeParameterList_1 {
    public static void main(String[] args) {
        MimeTypeParameterList parameterList = new MimeTypeParameterList();
        String value = parameterList.get("name");
        System.out.println("Value associated with 'name': " + value);
    }
}
