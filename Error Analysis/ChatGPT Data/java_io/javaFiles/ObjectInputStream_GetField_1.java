import java.io.ObjectInputStream;
import java.io.Serializable;

public class ObjectInputStream_GetField_1 {
    
    static class MyClass implements Serializable {
        private final boolean myField;
        
        public MyClass(boolean value) {
            myField = value;
        }
        
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass(true);
        ObjectInputStream.GetField fields;
        
        try {
            // Create ObjectInputStream GetField
            fields = ObjectInputStream.GetField(obj);
            
            // Get the value of the field with the specified name
            boolean value = fields.defaulted("myField");
            
            // Print the value
            System.out.println("myField defaulted value: " + value);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
