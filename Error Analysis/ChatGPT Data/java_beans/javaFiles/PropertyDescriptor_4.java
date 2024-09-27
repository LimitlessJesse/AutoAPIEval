import java.beans.PropertyDescriptor;

public class PropertyDescriptor_4 {
    public static void main(String[] args) {
        try {
            PropertyDescriptor propertyDescriptor = new PropertyDescriptor("propertyName", MyClass.class);
            System.out.println("Write Method: " + propertyDescriptor.getWriteMethod());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class MyClass {
    private String propertyName;

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }
}
