import java.beans.PropertyDescriptor;
import java.util.ArrayList;

public class PropertyDescriptor_5 {
    public static void main(String[] args) {
        try {
            // Create an ArrayList object
            ArrayList<String> list = new ArrayList<>();

            // Get the PropertyDescriptor for the "add" method
            PropertyDescriptor pd = new PropertyDescriptor("add", ArrayList.class);

            // Get the write method
            Method addMethod = pd.getWriteMethod();

            // Invoke the method on the ArrayList object
            addMethod.invoke(list, "Hello");

            // Print the ArrayList
            System.out.println(list);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
