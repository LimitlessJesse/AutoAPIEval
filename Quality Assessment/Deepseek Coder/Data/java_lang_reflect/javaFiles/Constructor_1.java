import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;

public class Constructor_1 {
    public static void main(String[] args) {
        try {
            // Get the Constructor of ArrayList
            Class<?> arrayListClass = Class.forName("java.util.ArrayList");
            Constructor<?> arrayListConstructor = arrayListClass.getConstructor(int.class);

            // Create a new instance of ArrayList
            Object newArrayList = arrayListConstructor.newInstance(5);

            // Add elements to the new ArrayList
            Method addMethod = arrayListClass.getMethod("add", Object.class);
            addMethod.invoke(newArrayList, "Hello");

            // Print the new ArrayList
            System.out.println(newArrayList);
        } catch (ClassNotFoundException | NoSuchMethodException | InstantiationException |
                IllegalAccessException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
