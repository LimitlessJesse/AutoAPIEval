import javax.activation.MimeTypeParameterList;

public class MimeTypeParameterList_2 {
    public static void main(String[] args) {
        MimeTypeParameterList params = new MimeTypeParameterList();
        params.set("name", "value");

        String name = params.get("name");
        System.out.println(name);        
    }
}
