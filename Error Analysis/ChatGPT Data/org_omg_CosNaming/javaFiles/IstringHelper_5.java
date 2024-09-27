import org.omg.CosNaming.IstringHelper;

public class IstringHelper_5 {
    public static void main(String[] args) {
        String str = "Hello";
        String id = IstringHelper.id(str);
        System.out.println("ID of the string is: " + id);
    }
}
