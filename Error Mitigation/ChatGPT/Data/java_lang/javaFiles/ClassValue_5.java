import java.lang.ClassValue;

public class ClassValue_5 {
    public static void main(String[] args) {
        ClassValue<String> classValue = new ClassValue<String>() {
            @Override
            protected String computeValue(Class<?> type) {
                return "Value for " + type.getName();
            }
        };

        Class<?> myClass = ClassValue_5.class;
        System.out.println(classValue.get(myClass)); // Output: Value for ClassValue_5

        classValue.remove(myClass);
        System.out.println(classValue.get(myClass)); // Output: Value for ClassValue_5 (reinitialized)
    }
}
