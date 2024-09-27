import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;

public class StringNameHelper_2 {
    public static void main(String[] args) {
        Any a = new Any(); // Create an instance of Any
        String b = "example"; // Create a string to insert
        StringNameHelper.insert(a, b); // Call the insert method from StringNameHelper
    }
}
