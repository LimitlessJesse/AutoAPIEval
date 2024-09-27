import java.beans.PropertyDescriptor;
import java.lang.reflect.Method;

public class PropertyDescriptor_2 {
    public static void main(String[] args) throws Exception {
        // Create a sample class with a property
        class Sample {
            private String name;

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }
        }

        // Use PropertyDescriptor to get the property type
        PropertyDescriptor propertyDescriptor = new PropertyDescriptor("name", Sample.class);
        Class<?> propertyType = propertyDescriptor.getPropertyType();

        // Output the property type
        System.out.println("Property Type: " + propertyType.getName());
    }
}
