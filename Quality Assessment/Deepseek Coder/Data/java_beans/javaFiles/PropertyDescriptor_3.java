import java.beans.PropertyDescriptor;
import java.util.ArrayList;

public class PropertyDescriptor_3 {
    public static void main(String[] args) {
        try {
            PropertyDescriptor pd = new PropertyDescriptor("add", ArrayList.class);
            Class<?> propertyType = pd.getPropertyType();
            System.out.println(propertyType);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
