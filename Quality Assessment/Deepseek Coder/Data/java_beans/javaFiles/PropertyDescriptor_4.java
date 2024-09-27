import java.beans.PropertyDescriptor;
import java.util.ArrayList;

public class PropertyDescriptor_4 {
    public static void main(String[] args) {
        try {
            // Create a PropertyDescriptor for the "add" method of ArrayList
            PropertyDescriptor pd = new PropertyDescriptor("add", ArrayList.class);

            // Get the Method object for the "add" method
            Method addMethod = pd.getWriteMethod();

            // Create an ArrayList
            ArrayList<String> list = new ArrayList<>();

            // Use the Method object to add an element to the list
            addMethod.invoke(list, "Hello");

            // Print the list
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
