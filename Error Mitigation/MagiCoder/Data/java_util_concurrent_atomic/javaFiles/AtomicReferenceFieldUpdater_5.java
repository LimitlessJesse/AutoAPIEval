import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public class AtomicReferenceFieldUpdater_5 {
    public static void main(String[] args) {
        // Define a class with a volatile field
        class MyClass {
            volatile int field;
        }

        // Create an updater for the field
        AtomicReferenceFieldUpdater<MyClass, Integer> updater =
                AtomicReferenceFieldUpdater.newUpdater(MyClass.class, int.class, "field");

        // Create an instance of the class
        MyClass obj = new MyClass();

        // Set the field using the updater
        updater.set(obj, 42);

        // Print the field value
        System.out.println(obj.field);  // Output: 42
    }
}
