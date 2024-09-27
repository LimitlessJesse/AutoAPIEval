import java.lang.ClassValue;

public class ClassValue_2 {
    public static void main(String[] args) {
        ClassValue<String> classValue = new ClassValue<String>() {
            @Override
            protected String computeValue(Class<?> type) {
                return "Value for " + type.getName();
            }
        };

        Class<?> myClass = ClassValue_2.class;
        System.out.println("Initial value for " + myClass.getName() + ": " + classValue.get(myClass));

        // Remove the associated value for the class
        classValue.remove(myClass);

        // Try to get the value again after removal
        System.out.println("Value after removal: " + classValue.get(myClass));
    }
}
