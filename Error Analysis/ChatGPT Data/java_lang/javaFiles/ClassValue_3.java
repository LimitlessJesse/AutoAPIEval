import java.lang.ClassValue;

public class ClassValue_3 {
    public static void main(String[] args) {
        ClassValue<String> classValue = new ClassValue<String>() {
            @Override
            protected String computeValue(Class<?> type) {
                return "Value for " + type.getSimpleName();
            }
        };
        
        Class<?> keyClass = String.class;
        System.out.println("Value for " + keyClass.getSimpleName() + ": " + classValue.get(keyClass));
        
        // Remove the mapping for the specified class key
        classValue.remove(keyClass);
        
        // Try to get the value again after removal
        System.out.println("Value for " + keyClass.getSimpleName() + " after removal: " + classValue.get(keyClass));
    }
}
